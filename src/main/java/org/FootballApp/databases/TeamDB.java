package org.FootballApp.databases;

import org.FootballApp.entities.Player;
import org.FootballApp.entities.Team;
import org.FootballApp.models.DatabaseModels;
import org.FootballApp.utility.DatabaseManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TeamDB extends DatabaseManager<Team> {
	
	public Optional<Team> findByID(Integer teamID) {
		for (Team team : veriListesi) {
			if (team.getId() == teamID) {
				return Optional.of(team);
			}
		}
		return Optional.empty();
	}
	
	public Optional<Team> findByName(String teamName) {
		for (Team team : veriListesi) {
			if (team.getTeamName().equalsIgnoreCase(teamName)) {
				return Optional.of(team);
			}
		}
		return Optional.empty();
	}
	
	public List<Team> listAll() {
		return veriListesi;
	}
	
	public List<Team> findByTeamName(String teamName) {
		List<Team> foundTeams = new ArrayList<>();
		for (Team team : veriListesi) {
			if (team.getTeamName().toLowerCase().contains(teamName.toLowerCase())) {
				foundTeams.add(team);
				
			}
		}
		return foundTeams;
	}
	public List<Team> findAllByLeagueID(Integer leagueID) {
		List<Team> foundTeams = new ArrayList<>();
		for (Team team : veriListesi) {
			if (team.getLeagueID() == leagueID) {
				foundTeams.add(team);
			}
		}
		return foundTeams;
	}
	
	public List<Integer> findAllTeamIDsByLeagueID(Integer leagueID) {
		List<Integer> foundTeams = new ArrayList<>();
		for (Team team : veriListesi) {
			if (team.getLeagueID() == leagueID) {
				foundTeams.add(team.getId());
			}
		}
		return foundTeams;
	}
	
	public List<Player> findPlayersByTeamID(Integer teamID) {
		List<Player> byTeamID = DatabaseModels.playerDB.findByTeamID(teamID);
		return byTeamID;
	}
	
}