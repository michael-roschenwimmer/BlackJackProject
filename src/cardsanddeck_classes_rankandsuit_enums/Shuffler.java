package cardsanddeck_classes_rankandsuit_enums;

import java.util.Collections;

public class Shuffler {
	One52CardDeck oneDeck = new One52CardDeck();

	public void shuffleOneDeck() {
		System.out.println("\n**Shuffled below**");
		Collections.shuffle(oneDeck);
		for (Card card : oneDeck) {
			System.out.println(card);

		}

	}
}