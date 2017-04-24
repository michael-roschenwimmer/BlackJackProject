package blackjackgame;

import cardsanddeck_classes_rankandsuit_enums.Card;

public class BlackJackPlayer {      // Make Abstract so that dealer "player" can be child and BlackJackPlayer is parent class
	
	private int chips;          // every players needs their chips, including the dealer
	private String name = "THE PLAYER";	
	private BlackJackHand hand = new BlackJackHand();      // instantiated BlackJackHand as a field
	
	
	public Card hitMe(Card c){            // adds a card to the player's hand to attempt
													  // removes one card from the deck
		
		this.hand.addHitCard(c);
		return c;
		
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
