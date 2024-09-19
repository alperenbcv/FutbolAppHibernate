package org.FootballApp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import org.FootballApp.models.DatabaseModels;

public class Team extends BaseEntity {
	
	
	@Column(length = 50, nullable = false, unique = true)
	private String teamName;
	private String teamLocation;
	private Double transferBudget;
	private Double wageBudget;
	private String stadiumName;
	@JoinColumn(name = "league_id", referencedColumnName = "id"  )
	private Integer leagueID;
	
	public Team() {
	}
	
	public Team(Integer LeagueID, String teamName, String teamLocation, String stadiumName, Double transferBudget,
	            Double wageBudget) {
		this.leagueID = LeagueID;
		this.teamName = teamName;
		this.teamLocation = teamLocation;
		this.stadiumName = stadiumName;
		this.transferBudget = transferBudget;
		this.wageBudget = wageBudget;
		DatabaseModels.teamDB.save(this);
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	public void setTeamLocation(String teamLocation) {
		this.teamLocation = teamLocation;
	}
	
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	
	public Integer getLeagueID() {
		return leagueID;
	}
	
	public void setLeagueID(Integer leagueID) {
		this.leagueID = leagueID;
	}
	
	public String getTeamLocation() {
		return teamLocation;
	}
	
	
	public Double getTransferBudget() {
		return transferBudget;
	}
	
	public void setTransferBudget(Double transferBudget) {
		this.transferBudget = transferBudget;
	}
	
	public Double getWageBudget() {
		return wageBudget;
	}
	
	public void setWageBudget(Double wageBudget) {
		this.wageBudget = wageBudget;
	}
	
	public String getStadiumName() {
		return stadiumName;
	}
	
	@Override
	public String toString() {
		return String.format("Team ID: %d, Name=%s, Location=%s, Stadium=%s, TransferBudget=%.1f, WageBudget=%.1f",
		                     getId(), getTeamName(), getTeamLocation(), getStadiumName(), getTransferBudget(),
		                     getWageBudget());
	}
	
}