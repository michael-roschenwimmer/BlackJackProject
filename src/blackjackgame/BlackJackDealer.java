package blackjackgame;

import java.util.List;

import cardsanddeck_classes_rankandsuit_enums.Card;
import cardsanddeck_classes_rankandsuit_enums.Shuffler;

public class BlackJackDealer {
	
	private String name;
	private double houseChips;
	Shuffler machineShuffler = new Shuffler();
	BlackJackDealer robot = new BlackJackDealer();
	
	public void startAndDealWithOneDeck(List<Card> oneDeck){
		System.out.println(robot.toString() + "Are you feelin lucky, punk?");
		robot.machineShuffler.shuffleOneDeck(oneDeck);
		robot.dealOneDeck(oneDeck);
		System.out.println(robot.toString() + "Read'em and weep!");
		
	}
	public void dealOneDeck(List<Card> oneDeck){
		
	}

	public List<Card> dealerShuffleOneDeck(List<Card> oneDeck){
		machineShuffler.shuffleOneDeck(oneDeck);
		return oneDeck;
	}
	
	public List<Card> dealerShuffleSixDecks(List<Card> sixDecks){
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
