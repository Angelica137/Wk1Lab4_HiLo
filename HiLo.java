/*
 * @author Tommy Yuan - dowloaded 08 March
 * The purpose is to practise the use of if statement.
 * author Angelica Beristain - 15 March 2021
 * */

import java.util.*;

public class HiLo {

	int random;
	int guess;

	public void generateNumber() {
		// Generate a random int between 1 and 100

		random = (int) (Math.random() * 100) + 1;
		System.out.println(random);
	}

	// Write the guess() method below
	public void guess() {
		// Use scanner to accept a user input
		// Create a new scanner object to receive user input
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter you guess ");
		guess = sc.nextInt();

		// check if guess was high, low or hit
		if (guess < random) {
			System.out.println("Low");
		} else if (guess == random) {
			System.out.println("Hit");
		} else {
			System.out.println("High");
		}

	}

	// Write startGuessing method here
	public void startGuessing() {
		// it continues to call .guess() until user gets hit
		// counts number of guesses it took to get hit
	}

}
