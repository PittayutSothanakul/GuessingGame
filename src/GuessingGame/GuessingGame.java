package GuessingGame;

import java.util.Random; // for random numbers

/**
 * Game of guessing a secret number.-- Game hint number for augury
 * 
 * @author PitSot
 */

public class GuessingGame {
	/* properties of a guessing game */
	// TODO Declare variables for attributes of the game
	private int upperBound;
	private int secret;
	private String hint;

	/**
	 * Initialize a new game.
	 * 
	 * @param upperbound
	 *            is the max value for the secret number (>1).
	 */
	public GuessingGame(int upperBound) {
		this.upperBound = upperBound;
		this.secret = getRandomNumber(20);
		this.hint = "I'm thinking of aa number between 1 and " + upperBound;
	}

	/**
	 * Create a random number between 1 and limit.
	 * 
	 * @param limit
	 *            is the upper limit for random number
	 * @return a random number between 1 and limit (inclusive)
	 */
	private int getRandomNumber(int limit) {
		long seed = System.currentTimeMillis();
		Random random = new Random(seed);
		return random.nextInt(limit) + 1;
	}

	/**
	 * Create boolean to change Sting hint
	 * 
	 * @param number
	 *            is number form your input
	 * @return new hint if you guess true or false
	 */
	public boolean guess(int number) {
		if (number == this.secret) {
			setHint("Correct. The secret is " + this.secret);
			return true;

		} else if (number > this.secret) {
			setHint("Sorry, your guess is too large");
			return false;
		} else if (number < this.secret) {
			setHint("Sorry, your guess is too small");
			return false;
		} else {
			return false;
		}
	}

	/**
	 * Return a hint based on the most recent guess.
	 * 
	 * @return hint based on most recent guess
	 */
	public String getHint() {
		return hint;
	}

	/**
	 * Change a String hint in guess
	 * 
	 * @param hint
	 *            is Sting for hint
	 */
	public void setHint(String hint) {
		this.hint = hint;
	}

	/**
	 * return correct answer
	 * 
	 * @return secret to show correct answer
	 */
	public int getSecret() {
		return secret;
	}

}
