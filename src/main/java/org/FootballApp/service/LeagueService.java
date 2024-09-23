package org.FootballApp.service;

import org.FootballApp.entities.League;
import org.FootballApp.repository.ICRUD;
import org.FootballApp.repository.LeagueRepository;

public class LeagueService extends ServiceManager<League, Integer>  {
	private final LeagueRepository leagueRepository;
	
	public LeagueService() {
		this(new LeagueRepository());
	}
	
	private LeagueService(LeagueRepository repository) {
		super(repository);
		this.leagueRepository = repository;
	}
}