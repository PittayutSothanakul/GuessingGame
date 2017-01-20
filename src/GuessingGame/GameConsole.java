package GuessingGame;

import java.util.Scanner;

/**
 * the game console method for play a game
 * 
 * @author PitSot
 * @version 20/1/60
 */
public class GameConsole {
	/**
	 *  the method for input number by user and show guess
	 * @param game
	 * 				Receive upperBound number
	 * @return secret number
	 */
	public int play(GuessingGame game) {
		Scanner sc = new Scanner(System.in);
		String title = "Guessing Game";
		String prompt = " Your Guess ? : ";
		int num;
		int guesses =0;
		System.out.println(title);
		while (true) {
			guesses++;
			System.out.print(prompt);
			num = Integer.parseInt(sc.nextLine());
			game.guess(num);
			System.out.println(game.getHint());
			if (game.guess(num) == true) {
				break;
			}

		}
		System.out.println("You used "+guesses + " guesses");
		return game.getSecret();
	}

	/** create objects and start the game */
	public static void main(String[] args) {
		GuessingGame game = new GuessingGame(20);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
}
