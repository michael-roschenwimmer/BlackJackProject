package blackjackgame;

import java.util.List;

import cardsanddeck_classes_rankandsuit_enums.Card;

public class BlackJackPlayer {
	
	private int chips;          // every players needs their chips, including the dealer
	private String name;	
	private BlackJackHand hand = new BlackJackHand();      // instantiated BlackJackHand as a field
	
	public Card hitMe(List<Card> oneDeck){            // adds a card to the player's hand to attempt
		int removeCard = oneDeck.size() - 1;		  // to improve it or BUST
		Card hitCard = oneDeck.get(removeCard);
		this.hand.addHitCard(hitCard);
		return hitCard;
		
	}
	
	public boolean playerHasBlackJack() {             // method to check if player has BLACKJACK
		return hand.getHandValue() == 21;
	}



	public int getChips() {							// set player amount of casino chips
		return chips;
	}

	public void setChips(int chips) {              // change amount of chips lost/gained after each hand
		this.chips = chips;
	}

	public String getName() {					  // get name of player
		return name;
	}

	public void setName(String name) {           // set name of player
		this.name = name;
	}

	public BlackJackHand getHand() {			// get player hand
		return hand;
	}

	public void setHand(BlackJackHand hand) {   // set player hand
		this.hand = hand;
	}
	
	

}
