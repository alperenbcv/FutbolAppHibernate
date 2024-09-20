package org.FootballApp.models;

import org.FootballApp.entities.League;
import org.FootballApp.entities.Match;
import org.FootballApp.entities.Team;

import java.time.LocalDate;
import java.util.*;

public class FixtureModel {
	private List<Match> matchListofaLeague;
	private League league;
	private DatabaseModels databaseModel;
	
	public FixtureModel(DatabaseModels dm, League league) {
		this.league=league;
		this.databaseModel=dm;
		this.matchListofaLeague=DatabaseModels.matchDB.findByLeagueID(league.getId());
	}
	
	public void displayLeagueFixture() {
		System.out.println("--------------------------------------------------");
		System.out.println("Fixture Information:");
		System.out.println("--------------------------------------------------");
		System.out.println("League Name    : " + league.getLeagueName());
		System.out.println("Division     : " + league.getDivision());
		System.out.println("Season Start Date:" + league.getSeasonStartDate());
		System.out.println("Season End Date:" + league.getSeasonEndDate());
		System.out.println("Matches     : ");
		Map<Integer, List<Match>> matchesByWeek = new LinkedHashMap<>();
		int matchWeek = 1;
		LocalDate currentWeekStartDate = league.getSeasonStartDate();
		
		for (Match match : matchListofaLeague) {
			while (match.getMatchDate().isAfter(currentWeekStartDate.plusDays(6))) {
				matchWeek++;
				currentWeekStartDate = currentWeekStartDate.plusWeeks(1);
			}
			matchesByWeek.computeIfAbsent(matchWeek, k -> new ArrayList<>()).add(match);
		}
		
		for (Map.Entry<Integer, List<Match>> entry : matchesByWeek.entrySet()) {
			System.out.println("Week " + entry.getKey() + ":");
			for (Match match : entry.getValue()) {
				String homeTeamName = DatabaseModels.teamDB.findByID(match.getHomeTeam().getId()).map(Team::getTeamName).orElse("Unknown");
				String awayTeamName = DatabaseModels.teamDB.findByID(match.getAwayTeam().getId()).map(Team::getTeamName).orElse("Unknown");
				System.out.println("  " + match.getMatchDate() + ": " + homeTeamName + " vs " + awayTeamName);
			}
		}
	}
	
	public void displayTeamFixture(String teamName) {
		System.out.println("--------------------------------------------------");
		System.out.println("Fixture Information:");
		System.out.println("--------------------------------------------------");
		System.out.println("League Name    : " + league.getLeagueName());
		System.out.println("Division     : " + league.getDivision());
		System.out.println("Season Start Date:" + league.getSeasonStartDate());
		System.out.println("Season End Date:" + league.getSeasonEndDate());
		System.out.println("Matches     : ");
		
		
		Optional<Team> team = DatabaseModels.teamDB.findByName(teamName);
		
		Map<Integer, List<Match>> matchesByWeek = new LinkedHashMap<>();
		int matchWeek = 1;
		LocalDate currentWeekStartDate = league.getSeasonStartDate();
		
		for (Match match : matchListofaLeague) {
			while (match.getMatchDate().isAfter(currentWeekStartDate.plusDays(6))) {
				matchWeek++;
				currentWeekStartDate = currentWeekStartDate.plusWeeks(1);
			}
			matchesByWeek.computeIfAbsent(matchWeek, k -> new ArrayList<>()).add(match);
		}
		
		for (Map.Entry<Integer, List<Match>> entry : matchesByWeek.entrySet()) {
			System.out.println("Week " + entry.getKey() + ":");
			for (Match match : entry.getValue()) {
				String homeTeamName = DatabaseModels.teamDB.findByID(match.getHomeTeam().getId()).map(Team::getTeamName).orElse("Unknown");
				String awayTeamName = DatabaseModels.teamDB.findByID(match.getAwayTeam().getId()).map(Team::getTeamName).orElse("Unknown");
				
				if (match.getHomeTeam().getId() == team.get().getId() || match.getAwayTeam().getId() == team.get().getId()) {
					System.out.println("  " + match.getMatchDate() + ": " + homeTeamName + " vs " + awayTeamName);
				}
			}
		}
	}
	
	
	public List<Match> getMatchListofaLeague() {
		return matchListofaLeague;
	}
	
	public void setMatchListofaLeague(List<Match> matchListofaLeague) {
		this.matchListofaLeague = matchListofaLeague;
	}
	
	public League getLeague() {
		return league;
	}
	
	public void setLeague(League league) {
		this.league = league;
	}
}