package org.FootballApp.controller;

import org.FootballApp.entities.Manager;
import org.FootballApp.entities.Match;
import org.FootballApp.service.ManagerService;
import org.FootballApp.service.MatchService;

public class MatchController extends ControllerManager<Match, Integer>{
	private final MatchService matchService;
	
	public MatchController() {
		this(new MatchService());
	}
	
	private MatchController(MatchService service) {
		super(service);
		this.matchService = new MatchService();
	}
}