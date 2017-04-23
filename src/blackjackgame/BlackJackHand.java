package blackjackgame;

import java.util.ArrayList;

import cardsanddeck_classes_rankandsuit_enums.Card;
import cardsanddeck_classes_rankandsuit_enums.Rank;

public class BlackJackHand {
	
	private ArrayList<Card> cardsInHand;          // private ArrayList of Cards to keep track of player hand
	
	public void addHitCard(Card hitCard){         // adds "hit" card to hand
		cardsInHand.add(hitCard);
	}
	public int getHandValue() {                  // returns numeric value of hand
		int sum = 0;
		for (Card card : cardsInHand) {
			sum += card.getRank().getNumberValue();
		}
		
		int decreasedAceValue = 0;
		
		while (sum > 21 && handHasAce() && howManyAcesInHand() != decreasedAceValue){  
			sum -= 10;
			decreasedAceValue++;
		}
		return sum;
	}
	
	public boolean handBusted(){         // player reached sum of over 21 and busted (lost the hand)
		return getHandValue() > 21;
	}
	
	
	public boolean handHasAce() {       // checks to see player hand has at least (1) ACE in it
		for (Card card : cardsInHand) {
			if (card.getRank() == Rank.ACE) {
				return true;
			}
			
		
		}
		return false;                  
		
	}
	private int howManyAcesInHand(){       // if player has an ace in the hand then will run method
		int aceCount = 0;                  // to see how many races are in the hand
		
		for (Card card : cardsInHand) {
			if (card.getRank() == Rank.ACE) {
				aceCount++;
			}
		}
		return aceCount;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BlackJackHand [cardsInHand=");
		builder.append(cardsInHand);
		builder.append("]");
		return builder.toString();
	}
	
}	
	
//	public void playerHandShow(){  // not sure if if I will use these two yet
//		
//	}
//
//	public void dealerHandShow(){
//		
//	}
	
