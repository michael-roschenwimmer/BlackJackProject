package cardsanddeck_classes_rankandsuit_enums;

import java.util.ArrayList;
import java.util.List;

public class Six52CardDecks {
	
	
	public void createSix52CardDeck() {
		List<Card> sixDecks = new ArrayList<>(312);

		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				sixDecks.add(new Card(rank, suit));
			}
		}
	}
}


