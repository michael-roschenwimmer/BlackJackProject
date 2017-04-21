package blackjackgame;

import java.util.List;

import cardsanddeck_classes_rankandsuit_enums.Card;
import cardsanddeck_classes_rankandsuit_enums.Shuffler;

public class BlackJackDealer {

	public void dealerShuffleOneDeck(List<Card> oneDeck){
		Shuffler machineShuffler = new Shuffler();
		machineShuffler.shuffleOneDeck(oneDeck);
	}
	
	public void dealerShuffleSixDecks(List<Card> sixDecks){
		Shuffler machineShuffler = new Shuffler();
		machineShuffler.shuffleSixDecks(sixDecks);
	}
	
}
