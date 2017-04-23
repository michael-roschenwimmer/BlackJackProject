package blackjackgame;

import java.util.Scanner;

import cardsanddeck_classes_rankandsuit_enums.Card;
import cardsanddeck_classes_rankandsuit_enums.One52CardDeck;
import cardsanddeck_classes_rankandsuit_enums.Shuffler;

public class BlackJackGameDriver {

//	BlackJackDealer dealerOne = new BlackJackDealer(); // whole bunch of
														// instantiation
	BlackJackPlayer playerOne = new BlackJackPlayer();
	Shuffler shuffleOneDeckOnly = new Shuffler();
	One52CardDeck one52CardDeck = new One52CardDeck();
//	BlackJackHand playerOneHand = new BlackJackHand();
//	BlackJackHand dealerOnehand = new BlackJackHand();
	
	
	// need to add more methods later

	public void startBlackJackGame(BlackJackDealer robot) {
	 one52CardDeck.createOne52CardDeck(); 
	 shuffleOneDeckOnly.shuffleOneDeck(one52CardDeck);// created a 52 card deck
//	shuffleOneDeckOnly.shuffleOneDeck(one52CardDeck);     // need help from Aaron here
		
		System.out.println("Dealer is dealing... Press Q to quit at any time...");
		dealerDeals(robot);
		
		if(robot.playerHasBlackJack()) {
			System.out.println(robot.getName() + " has BLACKJACK!");
			if(playerOne.playerHasBlackJack()) {
				System.out.println(robot.getName() + " We both have BLACKJACK! Let's get to the next hand.");
				dealerDeals(robot);  // to loop to the next hand  --- PUSH
			}
			else if(playerOne.getHand().getHandValue() < 21) {
				System.out.println(robot.getName() + " Sorry, you lose this hand " + playerOne.getName());
				dealerDeals(robot); // to loop to the next hand   -- insert method to take player's chip that they bet
				
		}
		
		if (playerOne.playerHasBlackJack()) {
			System.out.println(playerOne.getName() + " has BLACKJACK!");
			if(robot.getHand().getHandValue() < 21) {
				System.out.println("You win this hand " + playerOne.getName() + "!");
				// insert method to add to player's chips
				dealerDeals(robot); // to loop to the next hand
			}
		}
		}
		
	}

	public void dealerDeals(BlackJackDealer robot) {
		Card dealtCard;

		dealtCard = playerOne.hitMe(one52CardDeck.getOneCardFromDeck());
		System.out.println(playerOne.getName() + "draws: " + dealtCard);
		
		dealtCard = robot.hitMe(one52CardDeck.getOneCardFromDeck());
		System.out.println(robot.getName() + "draws: " + dealtCard);
		
		dealtCard = playerOne.hitMe(one52CardDeck.getOneCardFromDeck());
		System.out.println(playerOne.getName() + "draws: " + dealtCard);
		
		dealtCard = robot.hitMe(one52CardDeck.getOneCardFromDeck());
		System.out.println(robot.getName() + "draws their face-down card.");

	}

	public void displayHands() {
		System.out.println("Player's hand is: " + playerOne.getHand().getHandValue());

	}

	public void playerInput() { // takes player input throughout the game/hands
		Scanner kb = new Scanner(System.in);
		String choice = kb.nextLine();

		System.out.println(playerOne.getName() + " Would you like to hit or stay? Please type H for HIT or S for STAY.");
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
