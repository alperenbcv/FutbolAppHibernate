package org.FootballApp.repository;

import org.FootballApp.entities.Player;
import org.FootballApp.entities.Team;

public class TeamRepository extends RepositoryManager<Team, Integer>{
	
	public TeamRepository() {
		super(Team.class);
	}
}