package org.FootballApp.controller;

import org.FootballApp.entities.Match;
import org.FootballApp.entities.Player;
import org.FootballApp.service.MatchService;
import org.FootballApp.service.PlayerService;

public class PlayerController extends ControllerManager<Player, Integer>{
	private final PlayerService playerService;
	
	public PlayerController() {
		this(new PlayerService());
	}
	
	private PlayerController(PlayerService service) {
		super(service);
		this.playerService = new PlayerService();
	}
}