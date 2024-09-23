package org.FootballApp.controller;

import org.FootballApp.entities.League;
import org.FootballApp.service.ICRUDService;
import org.FootballApp.service.LeagueService;

public class LeagueController extends ControllerManager<League, Integer>{
	private final LeagueService leagueService;
	
	public LeagueController() {
        this(new LeagueService());
    }
	
	private LeagueController(LeagueService service) {
		super(service);
		this.leagueService = new LeagueService();
	}
}