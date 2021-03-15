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

		// write your code below

	}

	// Write startGuessing method here

}
