package cardsanddeck_classes_rankandsuit_enums;

import java.util.ArrayList;
import java.util.List;

public class Six52CardDecks {
	
	
	public void createNewDeck() {
		List<Card> sixDecks = new ArrayList<>(312);

		for (Suit s : Suit.values()) {
			for (Rank r : Rank.values()) {
				sixDecks.add(new Card(r, s));
			}
		}
	}
}


