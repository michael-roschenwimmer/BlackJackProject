package blackjackgame;

import java.util.List;
import java.util.Scanner;

import cardsanddeck_classes_rankandsuit_enums.Card;
import cardsanddeck_classes_rankandsuit_enums.One52CardDeck;
import cardsanddeck_classes_rankandsuit_enums.Rank;
import cardsanddeck_classes_rankandsuit_enums.Shuffler;

public class BlackJackGameDriver {

	BlackJackDealer dealerOne = new BlackJackDealer(); // whole bunch of
	// instantiation
	BlackJackPlayer playerOne = new BlackJackPlayer();
	Shuffler shuffleOneDeckOnly = new Shuffler();
	One52CardDeck one52CardDeck = new One52CardDeck();
	Scanner kb = new Scanner(System.in);

	// BlackJackHand playerOneHand = new BlackJackHand();
	// BlackJackHand dealerOnehand = new BlackJackHand();

	// need to add more methods later

	public void startBlackJackGame() {
		one52CardDeck.createOne52CardDeck();
		one52CardDeck.setOneDeck(shuffleOneDeckOnly.shuffleOneDeck(one52CardDeck.getOneDeck()));
		System.out.println("Dealer is dealing... Type 'Q' and enter to quit at any time...");
		System.out.println();
		dealerDeals();
		displayHands();

		if (!playerOne.playerHasBlackJack() && !dealerOne.playerHasBlackJack()) {
			System.out.println(playerOne.getName() + " would you like to hit or stay?");
			System.out.println("Please type 'H' for HIT or 'S' for STAY.");
			playerInput();
		}

		if (dealerOne.playerHasBlackJack()) {
			System.out.println(dealerOne.getName() + " has BLACKJACK!");
			if (playerOne.playerHasBlackJack()) {
				System.out.println(dealerOne.getName() + " We both have BLACKJACK! Let's get to the next hand.");
				dealerDeals(); // to loop to the next hand --- PUSH
			} else if (playerOne.getHand().getHandValue() < 21) {
				System.out.println(dealerOne.getName() + " Sorry, you lose this hand " + playerOne.getName());
				startBlackJackGame(); // to loop to the next hand -- insert
										// method to
				// take player's chip that they bet

			}

		}

		if (playerOne.playerHasBlackJack()) {
			System.out.println(playerOne.getName() + " has BLACKJACK!");
			if (dealerOne.getHand().getHandValue() < 21) {
				System.out.println("You win this hand " + playerOne.getName() + "!");
				// insert method to add to player's chips
				dealerDeals(); // to loop to the next hand
			}
		}

		playerInput();
		System.out.println("Do you want to play again?");
		String yesOrNo = kb.nextLine();
		if (yesOrNo.equals("y")) {
			startBlackJackGame();
		}

	}

	public void dealerDeals() {
		Card dealtCard;

		dealtCard = playerOne.hitMe(one52CardDeck.getOneCardFromDeck());
		System.out.println(playerOne.getName() + " draws: " + dealtCard);
		System.out.println();

		dealtCard = dealerOne.hitMe(one52CardDeck.getOneCardFromDeck());
		System.out.println(dealerOne.getName() + " draws: " + dealtCard);
		System.out.println();

		dealtCard = playerOne.hitMe(one52CardDeck.getOneCardFromDeck());
		System.out.println(playerOne.getName() + " draws: " + dealtCard);
		System.out.println();

		dealtCard = dealerOne.hitMe(one52CardDeck.getOneCardFromDeck());
		System.out.println(dealerOne.getName() + " draws their face-down card.");
		System.out.println();

	}

	public void displayHands() {
		System.out.println("Player's hand is: " + playerOne.getHand().getHandValue());
		System.out.println("Dealer's hand is: " + dealerOne.getHand().getHandValue());

	}

	public void playerInput() { // takes player input throughout the game/hands
		String choice = kb.nextLine();
		int playerTotal = calculateTotal(playerOne.getHand().getCardsInHand());
		boolean keepPlaying = true;
		System.out.println(playerOne.getName() + " would you like to hit or stay?");
		System.out.println("Please type 'H' for HIT or 'S' for STAY.");
		// while (keepPlaying) {
		if (choice.equals("H") || choice.equals("h")) {
			System.out.println("So, you're feeling lucky, eh?");
			// Player Hits
			playerOne.hitMe(one52CardDeck.getOneCardFromDeck());
			playerTotal = calculateTotal(playerOne.getHand().getCardsInHand());
			displayHands();
		}
		if (choice.equals("S") || choice.equals("s")) {
			// Player Stays
			int dealerTotal = calculateTotal(dealerOne.getHand().getCardsInHand());
			while (dealerTotal < 17) {
				dealerOne.hitMe(one52CardDeck.getOneCardFromDeck());
				dealerTotal = calculateTotal(dealerOne.getHand().getCardsInHand());
			}
			// create method to check who wins.... pass in dealerTotal and
			// playerTotal
			playerTotal = calculateTotal(playerOne.getHand().getCardsInHand());
			dealersTurnToFindOutWinner(playerTotal, dealerTotal);
			keepPlaying = false;

		}
		if (choice.equals("Q") || choice.equals("q")) {
			System.out.println("Thanks for giving us your money! Come back again now, y'hear!?");
			kb.close();
			System.exit(0);
			// keepPlaying = false;
		}
	}

	// }

	public void dealersTurnToFindOutWinner(int playerTotal, int dealerTotal) {
		System.out.println(dealerOne.getName() + " is now hitting to try to beat " + playerOne);

		if (playerOne.getHand().getHandValue() < dealerOne.getHand().getHandValue()) {
			System.out.println(playerOne + " has lost the hand");
			displayHands();
		}
		while (dealerOne.getHand().getHandValue() < 16) {
			Card hitCard = dealerOne.hitMe(one52CardDeck.getOneCardFromDeck());
			System.out.println(dealerOne + " hits and gets " + hitCard);

			displayHands();

			if (dealerOne.getHand().getHandValue() > 21) {
				System.out.println(dealerOne + " has BUSTED!!!");
				displayHands();
			}

			if (playerOne.getHand().getHandValue() < dealerOne.getHand().getHandValue()) {
				System.out.println(playerOne + " has LOST!!!");
				displayHands();
			}
		}

	}

	public int calculateTotal(List<Card> hand) {
		int total = 0;
		for (Card card : hand) {
			total = total + card.getRank().getNumberValue();
		}
		// total = 31
		for (Card card : hand) {
			if (total > 21 && card.getRank().equals(Rank.ACE)) {
				total = total - 10;
			}
		}
		return total;
	}

}
