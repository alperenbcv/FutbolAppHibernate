package org.FootballApp.service;

import org.FootballApp.entities.League;
import org.FootballApp.entities.Manager;
import org.FootballApp.repository.LeagueRepository;
import org.FootballApp.repository.ManagerRepository;

public class ManagerService extends ServiceManager<Manager, Integer>  {
	private final ManagerRepository managerRepository;
	
	public ManagerService() {
		this(new ManagerRepository());
	}
	
	private ManagerService(ManagerRepository repository) {
		super(repository);
		this.managerRepository = repository;
	}
}