import java.util.*;

public class DiceGame {

	private Die die1;
	private Die die2;

	private String player;

	public DiceGame( String player ) {
		die1 = new Die();
		die2 = new Die();	
		this.player = player;
	}

	public void play() {
		
		System.out.println( "Rolling the dice..." );
		die1.roll();
		die2.roll();
		
		System.out.println( "Die 1: " + die1.getFaceValue());
		System.out.println( "Die 2: " + die2.getFaceValue());

		int totalValue = die1.getFaceValue()+die2.getFaceValue();

		if( totalValue > 7 ) System.out.println( player + " won!" );
		else System.out.println( player + " lost!" );
	}
}