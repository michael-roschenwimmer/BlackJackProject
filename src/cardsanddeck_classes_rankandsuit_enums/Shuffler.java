package cardsanddeck_classes_rankandsuit_enums;

import java.util.Collections;
import java.util.List;

public class Shuffler {
	

	public void shuffleOneDeck(List<Card> oneDeck) {
		Shuffler machineShuffler = new Shuffler();
		machineShuffler.shuffleOneDeck(oneDeck);
		System.out.println("\n**Shuffled below**");
		Collections.shuffle((List<Card>) oneDeck);
		}
	
	
//	public void shuffleSixDecks (List<Card> SixDecks) {
//		Shuffler machineShuffler = new Shuffler();
//		machineShuffler.shuffleOneDeck(SixDecks);
//		System.out.println("\n**Shuffled below**");
//		Collections.shuffle((List<Card>) SixDecks);
//		}
	
}
//		for (Card card : oneDeck) {
//			System.out.println(card);
//	}