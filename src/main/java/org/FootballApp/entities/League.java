package org.FootballApp.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import org.FootballApp.enums.ERegion;
import org.FootballApp.models.DatabaseModels;

import java.time.LocalDate;
import java.util.List;

public class League extends BaseEntity {
	
	@Column(unique = true, nullable = false)
	private String leagueName;
	@Enumerated
	private ERegion region;
	private String season;
	private Integer division;
	private LocalDate seasonStartDate;
	private LocalDate seasonEndDate;
	@OneToMany(mappedBy = "league", cascade = CascadeType.ALL)
	private List<Integer> leagueTeamIDList;
	
	
	public League() {
	
	}
	
	public League(String leagueName, String season, Integer division, ERegion region) {
		
		this.leagueName = leagueName;
		this.season = season;
		this.division = division;
		this.region = region;
		this.seasonStartDate = LocalDate.of(2024, 8, 23);
		this.seasonEndDate = LocalDate.of(2025, 6, 1);
		DatabaseModels.leagueDB.save(this);
	}
	
	
	
	public LocalDate getSeasonStartDate() {
		return seasonStartDate;
	}
	
	public void setSeasonStartDate(LocalDate seasonStartDate) {
		this.seasonStartDate = seasonStartDate;
		
	}
	
	public LocalDate getSeasonEndDate() {
		return seasonEndDate;
	}
	
	public void setSeasonEndDate(LocalDate seasonEndDate) {
		this.seasonEndDate = seasonEndDate;
		
	}
	
	public String getLeagueName() {
		return leagueName;
	}
	
	public ERegion getRegion() {
		return region;
	}
	
	
	public String getSeason() {
		return season;
	}
	
	public void setSeason(String season) {
		this.season = season;
	}
	
	public List<Integer> getLeagueTeamIDList() {
		return leagueTeamIDList;
	}
	
	public void setLeagueTeamIDList(List<Integer> leagueTeamIDList) {
		this.leagueTeamIDList = leagueTeamIDList;
	}
	
	public Integer getDivision() {
		return division;
	}
}