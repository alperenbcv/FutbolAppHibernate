package org.FootballApp.repository;

import org.FootballApp.entities.Match;
import org.FootballApp.entities.Player;

public class PlayerRepository extends RepositoryManager<Player, Integer>{
	
	public PlayerRepository() {
		super(Player.class);
	}
}