package org.FootballApp.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.FootballApp.enums.ERegion;
import org.FootballApp.models.DatabaseModels;
import java.time.LocalDate;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@SuperBuilder
@Entity
@Table(name = "tblleague")
public class League extends BaseEntity {
	
	@Column(unique = true, nullable = false)
	private String leagueName;
	@Enumerated(EnumType.STRING)
	private ERegion region;
	private String season;
	private Integer division;
	private LocalDate seasonStartDate;
	private LocalDate seasonEndDate;
	@OneToMany(mappedBy = "league", cascade = CascadeType.PERSIST)
	private List<Team> leagueTeamList;
	@Transient
	private List<Integer> leagueTeamIDList;
	
	
	
	public League(String leagueName, String season, Integer division, ERegion region) {
		
		this.leagueName = leagueName;
		this.season = season;
		this.division = division;
		this.region = region;
		this.seasonStartDate = LocalDate.of(2024, 8, 23);
		this.seasonEndDate = LocalDate.of(2025, 6, 1);
		DatabaseModels.leagueDB.save(this);
	}
	
}