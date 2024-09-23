package org.FootballApp.controller;

import org.FootballApp.entities.League;
import org.FootballApp.entities.Manager;
import org.FootballApp.service.LeagueService;
import org.FootballApp.service.ManagerService;

public class ManagerController extends ControllerManager<Manager, Integer>{
	private final ManagerService managerService;
	
	public ManagerController() {
		this(new ManagerService());
	}
	
	private ManagerController(ManagerService service) {
		super(service);
		this.managerService = new ManagerService();
	}
}