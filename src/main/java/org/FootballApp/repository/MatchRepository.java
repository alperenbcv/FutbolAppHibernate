package org.FootballApp.repository;

import org.FootballApp.entities.League;
import org.FootballApp.entities.Match;

public class MatchRepository extends RepositoryManager<Match, Integer>{
	
	public MatchRepository() {
		super(Match.class);
	}
}