package cardsanddeck_classes_rankandsuit_enums;

import java.util.ArrayList;
import java.util.List;

public class One52CardDeck {
	
	public void createNewDeck() {
		List<Card> oneDeck = new ArrayList<>(52);
		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				oneDeck.add(new Card(r, s));
			}
		}
	}
}