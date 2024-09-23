package org.FootballApp.service;

import org.FootballApp.entities.Manager;
import org.FootballApp.entities.Match;
import org.FootballApp.repository.ManagerRepository;
import org.FootballApp.repository.MatchRepository;

public class MatchService extends ServiceManager<Match, Integer>  {
	private final MatchRepository matchRepository;
	
	public MatchService() {
		this(new MatchRepository());
	}
	
	private MatchService(MatchRepository repository) {
		super(repository);
		this.matchRepository = repository;
	}
}