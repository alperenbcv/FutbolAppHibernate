package org.FootballApp.databases;

import org.FootballApp.entities.League;
import org.FootballApp.entities.Manager;
import org.FootballApp.models.DatabaseModels;
import org.FootballApp.utility.DatabaseManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ManagerDB extends DatabaseManager<Manager> {
	
	public Optional<Manager> findByID(Integer managerID) {
		for (Manager manager : veriListesi) {
			if (manager.getId() == managerID) {
				return Optional.of(manager);
			}
		}
		return Optional.empty();
	}
	
	public Optional<Manager> findByName(String name) {
		for (Manager manager : veriListesi) {
			if (manager.getPersonName().equals(name)) {
				return Optional.of(manager);
			}
		}
		return Optional.empty();
	}
	
	public List<Manager> listAll() {
		return veriListesi;
	}
	
	public Optional<Manager> findByUsernameAndPassword(String username, String password) {
		for (Manager manager : veriListesi) {
			if (manager.getManagerUserName().equals(username) && manager.getManagerPassword().equals(password)) {
				return Optional.of(manager);
			}
		}
		return Optional.empty();
	}
	
	public List<Manager> findByLeagueID(Integer leagueID) {
		Optional<League> byID = DatabaseModels.leagueDB.findByID(leagueID);
		List<Manager> matchingManagers = new ArrayList<>();
		Manager manager = null;
		if (byID.isPresent()) {
			League league = byID.get();
			List<Integer> leagueTeamIDList = league.getLeagueTeamIDList();
			List<Manager> managers = listAll();
			
			Integer managerTeamID = manager.getTeam().getId();
			if (leagueTeamIDList.contains(managerTeamID)) {
				matchingManagers.add(manager);
			}
		}
		return matchingManagers;
	}

	
}