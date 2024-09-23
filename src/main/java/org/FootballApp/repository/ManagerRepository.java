package org.FootballApp.repository;

import org.FootballApp.entities.Manager;

public class ManagerRepository extends RepositoryManager<Manager, Integer>{
	
	public ManagerRepository() {
		super(Manager.class);
	}
}