package guessinggame;

/**
 * Game of guessing a secret number.
 * 
 * @author Pittayut Sothanakul
 * @version 20/1/60
 */
public class Main {
	/**
	 * The play method plays a game using input from a user.
	 * 
	 * @param args
	 *            create object and start the game
	 */
	public static void main(String[] args) {
		GuessingGame game = new GuessingGame(20);
		GameConsole ui = new GameConsole();
		ui.play(game);
	}
}
