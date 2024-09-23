package org.FootballApp.service;

import org.FootballApp.entities.Player;
import org.FootballApp.entities.Team;
import org.FootballApp.repository.PlayerRepository;
import org.FootballApp.repository.TeamRepository;

public class TeamService extends ServiceManager<Team, Integer>  {
	private final TeamRepository teamRepository;
	
	public TeamService() {
		this(new TeamRepository());
	}
	
	private TeamService(TeamRepository repository) {
		super(repository);
		this.teamRepository = repository;
	}
}