package org.FootballApp.utility.events;

import org.FootballApp.entities.Ball;
import org.FootballApp.entities.Match;
import org.FootballApp.entities.Player;
import org.FootballApp.utility.AverageCalculator;
import org.FootballApp.utility.ChanceConstantCalculator;

public class DribblingEvent extends Event{
	
	public boolean dribblingEvent(Ball ball, Player defender, Match match) {
		// Topu süren oyuncunun yetenekleri
		Integer dribbling = ball.getPlayerWithBall().getPlayerTechnicalAttributes().getDribbling();
		Integer speed = ball.getPlayerWithBall().getPlayerPhysicalAttributes().getSpeed();
		Integer decisionMaking = ball.getPlayerWithBall().getPlayerMentalAttributes().getDecisionMaking();
		
		// Savunma oyuncusunun yetenekleri
		Integer tackle = defender.getPlayerTechnicalAttributes().getTackle();
		Integer positioning = defender.getPlayerTechnicalAttributes().getPositioning();
		Integer strength = defender.getPlayerPhysicalAttributes().getStrength();
		
		// Dribbling yapma yeteneği (dribbling + hız + karar verme)
		int[] dribblingStats = {dribbling, speed, decisionMaking};
		double avgDribble = AverageCalculator.calculateAverage(dribblingStats);
		
		// Savunma yapma yeteneği (tackle + positioning)
		int[] defenseStats = {tackle, positioning, strength};
		double avgDefense = AverageCalculator.calculateAverage(defenseStats);
		
		double chance = ChanceConstantCalculator.chanceConstant(avgDribble);
		
		if(avgDribble*chance > avgDefense) {
			// Dribbling başarılı
			ball.setPosition(ball.getPosition() + 10*dribblingDirection(ball,match)); // Top 10 metre ilerler
			ball.setPlayerWithBall(ball.getPlayerWithBall());
			System.out.println("Dribble succeeded! Ball is now at position " + ball.getPosition());
			return true;
		} else {
			// Dribbling başarısız, top savunma oyuncusuna geçer
			ball.setPlayerWithBall(defender);
			System.out.println("Dribble failed! Ball intercepted by " + defender.getPersonName() + " at position " + ball.getPosition());
			return false;
		}
	}
	
	private Integer dribblingDirection(Ball ball, Match match) {
		
		if(ball.getPlayerWithBall().getTeam().getId() == match.getHomeTeam().getId()) {
			return -1;
		}
		else{
			return 1;
		}
	}
}