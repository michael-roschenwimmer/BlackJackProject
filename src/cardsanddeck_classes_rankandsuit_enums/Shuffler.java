package cardsanddeck_classes_rankandsuit_enums;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffler {
	

	public ArrayList<Card> shuffleOneDeck(ArrayList<Card> oneDeck) {
		shuffleOneDeck(oneDeck);
		System.out.println("\n**Dealer shuffled ALL of the cards**");
		Collections.shuffle(oneDeck);
		return oneDeck;
		}
	
	
	public void shuffleSixDecks (ArrayList<Card> SixDecks) {          // implement if I get everything else working
		Shuffler machineShuffler = new Shuffler();					// change later to reflect changes in one52CardDeck
		machineShuffler.shuffleSixDecks(SixDecks);
		System.out.println("\n**Dealer shuffled ALL of the cards**");
		Collections.shuffle((ArrayList<Card>) SixDecks);
		}
	
}
//		for (Card card : oneDeck) {
//			System.out.println(card);
//	}