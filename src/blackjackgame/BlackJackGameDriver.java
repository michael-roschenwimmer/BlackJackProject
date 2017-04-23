package blackjackgame;

import java.util.Scanner;

import cardsanddeck_classes_rankandsuit_enums.Card;
import cardsanddeck_classes_rankandsuit_enums.One52CardDeck;
import cardsanddeck_classes_rankandsuit_enums.Shuffler;

public class BlackJackGameDriver {

	BlackJackDealer dealerOne = new BlackJackDealer(); // whole bunch of
	// instantiation
	BlackJackPlayer playerOne = new BlackJackPlayer();
	Shuffler shuffleOneDeckOnly = new Shuffler();
	One52CardDeck one52CardDeck = new One52CardDeck();
	// BlackJackHand playerOneHand = new BlackJackHand();
	// BlackJackHand dealerOnehand = new BlackJackHand();

	// need to add more methods later

	public void startBlackJackGame() {
		dealerOne.setName("Jimmy");
		playerOne.setName("Player One");
		one52CardDeck.createOne52CardDeck();
		// shuffleOneDeckOnly.shuffleOneDeck(oneDeck)/ / created a 52 card deck
		// shuffleOneDeckOnly.shuffleOneDeck(one52CardDeck); // need help from
		// Aaron here

		System.out.println("Dealer is dealing... Press Q to quit at any time...");
		dealerDeals();

		if (dealerOne.playerHasBlackJack()) {
			System.out.println(dealerOne.getName() + " has BLACKJACK!");
			if (playerOne.playerHasBlackJack()) {
				System.out.println(dealerOne.getName() + " We both have BLACKJACK! Let's get to the next hand.");
				dealerDeals(); // to loop to the next hand --- PUSH
			} else if (playerOne.getHand().getHandValue() < 21) {
				System.out.println(dealerOne.getName() + " Sorry, you lose this hand " + playerOne.getName());
				dealerDeals(); // to loop to the next hand -- insert method to
								// take player's chip that they bet

			}

			if (playerOne.playerHasBlackJack()) {
				System.out.println(playerOne.getName() + " has BLACKJACK!");
				if (dealerOne.getHand().getHandValue() < 21) {
					System.out.println("You win this hand " + playerOne.getName() + "!");
					// insert method to add to player's chips
					dealerDeals(); // to loop to the next hand
				}
			}
		}

	}

	public void dealerDeals() {
		Card dealtCard;

		dealtCard = playerOne.hitMe(one52CardDeck.getOneCardFromDeck());
		System.out.println(playerOne.getName() + "draws: " + dealtCard);

		dealtCard = dealerOne.hitMe(one52CardDeck.getOneCardFromDeck());
		System.out.println(dealerOne.getName() + "draws: " + dealtCard);

		dealtCard = playerOne.hitMe(one52CardDeck.getOneCardFromDeck());
		System.out.println(playerOne.getName() + "draws: " + dealtCard);

		dealtCard = dealerOne.hitMe(one52CardDeck.getOneCardFromDeck());
		System.out.println(dealerOne.getName() + "draws their face-down card.");

	}

	public void displayHands() {
		System.out.println("Player's hand is: " + playerOne.getHand().getHandValue());

	}

	public void playerInput() { // takes player input throughout the game/hands
		Scanner kb = new Scanner(System.in);
		String choice = kb.nextLine();

		System.out
				.println(playerOne.getName() + " Would you like to hit or stay? Please type H for HIT or S for STAY.");
		if (choice.equals("H") || choice.equals("h")) {
			System.out.println("So, you're feeling lucky, eh?");
			// Insert HIT method here
		}
		if (choice.equals("S") || choice.equals("s")) {
			// Insert STAY method here

		}
		if (choice.equals("Q") || choice.equals("q")) {
			System.out.println("Thanks for giving us your money! Come back again now, y'hear!?");
			kb.close();
			System.exit(0);
		}

	}

}
