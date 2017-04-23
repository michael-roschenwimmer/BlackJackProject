package cardsanddeck_classes_rankandsuit_enums;

import java.util.ArrayList;

public class One52CardDeck {
	
	private ArrayList<Card> oneDeck = new ArrayList<>(52);
	
	public void createOne52CardDeck() {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				oneDeck.add(new Card(rank, suit));
			}
		}
	}

	public ArrayList<Card> getOneCardFromDeck() {
		return oneDeck;
	}
	
}