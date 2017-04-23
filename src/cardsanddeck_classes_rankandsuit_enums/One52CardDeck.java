package cardsanddeck_classes_rankandsuit_enums;

import java.util.ArrayList;
import java.util.List;

public class One52CardDeck {
	
	public void createOne52CardDeck() {
		List<Card> oneDeck = new ArrayList<>(52);
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				oneDeck.add(new Card(rank, suit));
			}
		}
	}
}