package org.FootballApp.repository;

import org.FootballApp.entities.Team;
import org.FootballApp.entities.TeamStats;

public class TeamStatRepository extends RepositoryManager<TeamStats, Integer>{
	
	public TeamStatRepository() {
		super(TeamStats.class);
	}
}