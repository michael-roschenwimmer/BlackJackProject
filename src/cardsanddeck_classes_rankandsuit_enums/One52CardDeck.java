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

	public Card getOneCardFromDeck() {
		return oneDeck.remove(0);
	}

	public ArrayList<Card> getOneDeck() {
		return oneDeck;
	}

	public void setOneDeck(ArrayList<Card> oneDeck) {
		this.oneDeck = oneDeck;
	}
	
	
}