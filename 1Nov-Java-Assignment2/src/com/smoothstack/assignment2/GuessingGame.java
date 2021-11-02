/**
 * A game where the user tries to guess a number between 1 and 100 within 5 attempts. 
 * If their guess is within +-10 of the chosen number, they win.
 * If they can't do that within 5 attempts, they lose.
 */
package com.smoothstack.assignment2;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Julius Cesar Estrope
 *
 */
public class GuessingGame {

	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Random random = new Random();
		
		int answer = random.nextInt(100) + 1; //Generate a random number between 1 and 100
		
		System.out.println("Please enter a guess between 1 and 100");
		
		for(int i = 0; i < 5; i++) {
			try {
				int guess = scanner.nextInt();
				
				if(((guess > answer)? guess - answer : answer-guess) <= 10) { //Check that the guess is within 10 of the answer
					System.out.println("The answer is: " + answer);
					scanner.close();
					System.exit(0);
				} else {
					System.out.println("Please guess again");
				}
			} catch (InputMismatchException ime) { //If user enters invalid input, ask them to enter the correct input and don't count it against them
				System.out.println("Please only enter a number between 1 and 100");
				scanner.nextLine(); //Clear the scanner input of invalid value
				i--;
				continue;
			}
		}
		
		System.out.println("Sorry.\n" + answer);
		
		scanner.close();
	}

}
