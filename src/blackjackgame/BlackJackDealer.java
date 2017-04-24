package blackjackgame;

import java.util.ArrayList;
import java.util.List;

import cardsanddeck_classes_rankandsuit_enums.Card;
import cardsanddeck_classes_rankandsuit_enums.Shuffler;

public class BlackJackDealer extends BlackJackPlayer {       // needed same methods as BlackJackPlayer
	
	private String name = "THE DEALER";	
	private double houseChips;
	Shuffler machineShuffler = new Shuffler();
	
//	BlackJackDealer robot = new BlackJackDealer();
	
	public void startAndDealWithOneDeck(ArrayList<Card> oneDeck){
		System.out.println(toString() + "Are you feelin lucky?");
		machineShuffler.shuffleOneDeck(oneDeck);
		dealOneDeck(oneDeck);
		System.out.println(toString() + "Read'em and weep!");
		
	}
	public void dealOneDeck(List<Card> oneDeck){
		
	}

	public List<Card> dealerShuffleOneDeck(ArrayList<Card> oneDeck){
		machineShuffler.shuffleOneDeck(oneDeck);
		return oneDeck;
	}
	
	public List<Card> dealerShuffleSixDecks(ArrayList<Card> sixDecks){
		machineShuffler.shuffleSixDecks(sixDecks);
		return sixDecks;
	}
	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BlackJackDealer [name=");
		builder.append(name);
		builder.append(", houseChips=");
		builder.append(houseChips);
		builder.append("]");
		return builder.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHouseChips() {
		return houseChips;
	}

	public void setHouseChips(double houseChips) {
		this.houseChips = houseChips;
	}

}
