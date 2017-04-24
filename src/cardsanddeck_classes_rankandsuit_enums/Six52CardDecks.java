package cardsanddeck_classes_rankandsuit_enums;

import java.util.ArrayList;
import java.util.List;

public class Six52CardDecks {
	
	private ArrayList<Card> sixDecks = new ArrayList<>(312);
	
	public void createSix52CardDeck() {
		for (Suit suit : Suit.values()) {
			for (Rank rank : Rank.values()) {
				sixDecks.add(new Card(rank, suit));
			}
		}
	}
	public Card getOneCardFromSixDecks() {
		return sixDecks.remove(0);
	}
	public ArrayList<Card> getSixDecks(){
		return sixDecks;
	}
	public void setSixDecks(ArrayList<Card> sixDecks){
		this.sixDecks = sixDecks;
	}
}


