package cardsanddeck_classes_rankandsuit_enums;

public enum Rank {
	TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), 
    JACK(10), QUEEN(10), KING(10), ACE(11);    // need to mess with the ACE
	
	private int numVal;
	
	Rank(int val) {
		this.numVal = val;
	}
	public int getNumVal(){
		return numVal;
	}
	
}
