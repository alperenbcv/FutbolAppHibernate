package org.FootballApp.controller;

import org.FootballApp.entities.Team;
import org.FootballApp.entities.TeamStats;
import org.FootballApp.service.TeamService;
import org.FootballApp.service.TeamStatService;

public class TeamStatController extends ControllerManager<TeamStats, Integer>{
	private final TeamStatService teamStatService;
	
	public TeamStatController() {
		this(new TeamStatService());
	}
	
	private TeamStatController(TeamStatService service) {
		super(service);
		this.teamStatService = new TeamStatService();
	}
}