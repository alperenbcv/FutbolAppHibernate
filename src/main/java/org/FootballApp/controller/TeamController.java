package org.FootballApp.controller;

import org.FootballApp.entities.Player;
import org.FootballApp.entities.Team;
import org.FootballApp.service.PlayerService;
import org.FootballApp.service.TeamService;

public class TeamController extends ControllerManager<Team, Integer>{
	private final TeamService teamService;
	
	public TeamController() {
		this(new TeamService());
	}
	
	private TeamController(TeamService service) {
		super(service);
		this.teamService = new TeamService();
	}
}