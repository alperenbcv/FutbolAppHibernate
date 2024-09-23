package org.FootballApp.repository;

import org.FootballApp.entities.League;

public class LeagueRepository extends RepositoryManager<League, Integer>{
	
	public LeagueRepository() {
		super(League.class);
	}
}