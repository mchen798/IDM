import java.util.Scanner;

public class Main {

	static String player;

	public static void main( String args[] ) {

		Scanner scanner = new Scanner(System.in);

		System.out.println( "What is your name?" );		
 		player = scanner.next();
		System.out.println( "Hello, " + player + "!" );		

		DiceGame game = new DiceGame(player);
		game.play();
	}
}