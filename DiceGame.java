import java.util.*;

public class DiceGame {

	private Die die1;
	private Die die2;

	public DiceGame() {
		die1 = new Die();
		die2 = new Die();	
	}

	public void play() {
		
		System.out.println( "Rolling the dice..." );
		die1.roll();
		die2.roll();
		
		System.out.println( "Die 1: " + die1.getFaceValue());
		System.out.println( "Die 2: " + die2.getFaceValue());

		int totalValue = die1.getFaceValue()+die2.getFaceValue();

		System.out.println( totalValue );
	}
}