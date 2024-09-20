package org.FootballApp.databases;

import org.FootballApp.entities.Match;
import org.FootballApp.models.DatabaseModels;
import org.FootballApp.utility.DatabaseManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MatchDB extends DatabaseManager<Match> {
	
	public Optional<Match> findByMatchID(Integer matchID) {
		for (Match match : veriListesi) {
			if (match.getId()==matchID) {
				return Optional.of(match);
			}
		}
		return Optional.empty();
	}
	
	public List<Match> listAll() {
		return veriListesi;
	}
	
	public List<Match> findByLeagueID(Integer leagueID) {
		List<Match> matchList = new ArrayList<>();
		for (Match match : veriListesi) {
			if (match.getLeague().getId() == leagueID) {
				matchList.add(match);
			}
		}
		return matchList;
	}
	
	public List<Match> findByTeamID(Integer teamID) {
		List<Match> matchList = new ArrayList<>();
		for (Match match : veriListesi) {
			if (match.getHomeTeam().getId() == teamID || match.getAwayTeam().getId() == teamID) {
				matchList.add(match);
			}
		}
		return matchList;
	}
	
	public List<Match> findByTeamName(String teamName) {
		List<Match> matchList = new ArrayList<>();
		for (Match match : veriListesi) {
			if (match.getHomeTeam().getId() == DatabaseModels.teamDB.findByName(teamName).get().getId() || match.getAwayTeam().getId() == DatabaseModels.teamDB.findByName(teamName).get().getId()) {
				matchList.add(match);
			}
		}
		return matchList;
	}
	
	
}