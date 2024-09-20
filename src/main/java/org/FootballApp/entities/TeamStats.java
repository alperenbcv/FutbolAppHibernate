package org.FootballApp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.FootballApp.entities.observerPatterns.Observable;
import org.FootballApp.entities.observerPatterns.Observer;
import org.FootballApp.enums.EMatchStatus;
import org.FootballApp.models.DatabaseModels;
import org.FootballApp.utility.DataIO;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.mapping.ToOne;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name="tblteamstats")
public class TeamStats extends BaseEntity {
	
	@ColumnDefault("CURRENT_DATE")
	private LocalDate lastUpdateDate;
	@ManyToOne
	@JoinColumn(name = "team_league_id", referencedColumnName = "id")
	private League teamLeague;
	@OneToOne
    @JoinColumn(name = "team_id", referencedColumnName = "id")
    private Team team;
	private Integer totalPoint=0;
	private Integer goalScored=0;
	private Integer goalConceded=0;
	private Integer average=0;
	private Integer gamesPlayed=0;
	private Integer gamesWon=0;
	private Integer gamesLost=0;
	private Integer gamesDrawn=0;
	
	public TeamStats(Integer teamID) {
	}
	
	@Override
	public void prePersist() {
		this.lastUpdateDate = LocalDate.now();
	}
	
	@Override
	public void preUpdate() {
		this.lastUpdateDate = LocalDate.now();
	}
	
	public void teamStatUpdater(LocalDate currentDate) {
		if (currentDate.isAfter(lastUpdateDate)) {
			teamPointCalculator(currentDate);
			teamGoalCalculator(currentDate);
			teamAverageCalculator();
			calculateGamesPlayed();
			lastUpdateDate = currentDate;
		}
	}
	
	public void calculateGamesPlayed() {
		List<Match> playedGames = teamsMatchGetter();
		this.gamesPlayed = playedGames.size();
	}
	
	public static void teamStatGenerator(){
		List<Team> teams = DatabaseModels.teamDB.listAll();
		for(Team team:teams){
			new TeamStats();
		}
	}
	
	public List<Match> teamsMatchGetter(){
		List<Match> byTeamID = DatabaseModels.matchDB.findByTeamID(this.team.getId());
		List<Match> playedGames = byTeamID.stream().filter(match -> match.getStatus().equals(EMatchStatus.PLAYED)).toList();
		return playedGames;
	}
	
	
	public Integer leagueIDFinder(){
		Optional<Team> byID = DatabaseModels.teamDB.findByID(this.team.getId());
		Team team = byID.get();
		return team.getLeagueID();
	}
	
	public void teamAverageCalculator(){
		this.average=this.goalScored-this.goalConceded;
	}
	
	public void teamGoalCalculator(LocalDate currentDate) {
		List<Match> playedGames = teamsMatchGetter().stream()
		                                            .filter(match -> match.getMatchDate().equals(currentDate))
		                                            .toList();
		for (Match match : playedGames) {
			if (match.getHomeTeam().getId() == this.team.getId()) {
				this.goalScored += match.getHomeTeamScore();
				this.goalConceded += match.getAwayTeamScore();
			}
			if (match.getAwayTeam().getId() == this.team.getId()) {
				this.goalScored += match.getAwayTeamScore();
				this.goalConceded += match.getHomeTeamScore();
			}
		}
	}
	
	public void teamPointCalculator(LocalDate currentDate) {
		List<Match> playedGames = teamsMatchGetter().stream()
		                                            .filter(match -> match.getMatchDate().equals(currentDate))
		                                            .toList();
		for (Match match : playedGames) {
			if (match.getHomeTeam().getId() == this.team.getId()) {
				if (match.getHomeTeamScore() > match.getAwayTeamScore()) {
					this.totalPoint += 3;
					this.gamesWon++;
				} else if (match.getHomeTeamScore().equals(match.getAwayTeamScore())) {
					this.totalPoint++;
					this.gamesDrawn++;
				} else {
					this.gamesLost++;
				}
			}
			if (match.getAwayTeam().getId() == this.team.getId()) {
				if (match.getAwayTeamScore() > match.getHomeTeamScore()) {
					this.totalPoint += 3;
					this.gamesWon++;
				} else if (match.getAwayTeamScore().equals(match.getHomeTeamScore())) {
					this.totalPoint++;
					this.gamesDrawn++;
				} else {
					this.gamesLost++;
				}
			}
		}
	}
	
}