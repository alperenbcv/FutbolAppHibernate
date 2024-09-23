package org.FootballApp.service;

import org.FootballApp.entities.TeamStats;
import org.FootballApp.repository.TeamRepository;
import org.FootballApp.repository.TeamStatRepository;

public class TeamStatService extends ServiceManager<TeamStats, Integer>  {
	private final TeamStatRepository teamStatRepository;
	
	public TeamStatService() {
		this(new TeamStatRepository());
	}
	
	private TeamStatService(TeamStatRepository repository) {
		super(repository);
		this.teamStatRepository = repository;
	}
}