package guessinggame;

import java.util.Scanner;

/**
 * the game console method for play a game
 * 
 * @author Pittayut Sothanakul
 * @version 01/02/60
 */
public class GameConsole {
	/**
	 * the method for input number by user and show guess
	 * 
	 * @param game
	 *            Receive upperBound number
	 * @return secret number
	 */
	public int play(GuessingGame game) {
		Scanner sc = new Scanner(System.in);
		String title = "Guessing Game";
		String prompt = " Your Guess ? : ";
		int num;
		boolean check = false;
		System.out.println(title);
		System.out.println(game.getHint());
		do {
			System.out.print(prompt);
			num = Integer.parseInt(sc.nextLine());
			check = game.guess(num);
			System.out.println(game.getHint());

		} while (!check);
		System.out.println("You used " + game.getCounts() + " guesses");
		return num;

	}

}
