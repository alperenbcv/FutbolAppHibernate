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

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@Table(name = "tblmatch")
public class Match extends BaseEntity {
	
	@ManyToOne
	@JoinColumn(name = "home_team_id", referencedColumnName = "id")
	private Team homeTeam;
    @ManyToOne
    @JoinColumn(name = "away_team_id", referencedColumnName = "id")
	private Team awayTeam;
	private LocalDate matchDate;
	@Enumerated(EnumType.STRING)
	private EMatchStatus status;
	@ManyToOne
	@JoinColumn(name = "league_id", referencedColumnName = "id")
    private League league;
	private Integer homeTeamScore;
	private Integer awayTeamScore;
	@Transient
	private Ball ball;
	
	public Match(Integer homeTeamId, Integer awayTeamId, LocalDate matchDate, EMatchStatus matchStatus, Integer leagueID) {
	}
}