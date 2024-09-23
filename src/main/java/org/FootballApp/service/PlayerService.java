package org.FootballApp.service;

import org.FootballApp.entities.Match;
import org.FootballApp.entities.Player;
import org.FootballApp.repository.MatchRepository;
import org.FootballApp.repository.PlayerRepository;

public class PlayerService extends ServiceManager<Player, Integer>  {
	private final PlayerRepository playerRepository;
	
	public PlayerService() {
		this(new PlayerRepository());
	}
	
	private PlayerService(PlayerRepository repository) {
		super(repository);
		this.playerRepository = repository;
	}
}