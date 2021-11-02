/**
 * This project uses for loops to display characters in the console
 */
package com.smoothstack.assignment1;

/**
 * @author Julius Cesar Estrope
 *
 */
public class CharacterLoop {

	public static void main(String[] args) { 
		CharacterLoop cL = new CharacterLoop();
		
		cL.patternOne();
		cL.patternTwo();
		cL.patternThree();
		cL.patternFour();
	}
	
	/*
	  	1)
		*
		**
		***
		****
		.........
	 */
	private void patternOne() {
		System.out.println("1)");
		for(int i = 1; i <= 4; i++) {
			printCharacters('*', i);
		}
		printCharacters('.', 9);
	}
	
	/*
	 	2)
		.........
		****
		***
		**
		*
	 */
	private void patternTwo() {
		System.out.println("2)");
		printCharacters('.', 9);
		for(int i = 4; i > 0; i--) {
			printCharacters('*', i);
		}
	}
	
	/*
		3)
		     *
		    ***
		   *****
		  *******
		...........
	 */
	private void patternThree() {
		System.out.println("3)");
		for(int i = 1; i <= 7; i+=2) {
			printCenteredCharacters('*', i, 11);
		}
		printCenteredCharacters('.', 11, 11);
	}
	
	/*
		4)
		............
		  *******
		   *****
		    ***
		     *
	 */
	private void patternFour() {
		System.out.println("4)");
		printCenteredCharacters('.', 11, 11);
		for(int i = 7; i > 0; i-=2) {
			printCenteredCharacters('*', i, 11);
		}
	}
	
/****	HELPER FUNCTIONS	****/
	
	//print a character a specified number of times
	private void printCharacters(char character, int repetitions) {
		for(int i = 0; i < repetitions; i++) {
			System.out.print(character);
		}
		System.out.println("");
	}
	
	//print a character a specified number of times, center justified at a set width using the space character
	//EXAMPLE - '.' character repeated 3 times with width of 6 is as follows (excluding parentheses)
	//(   ...)
	private void printCenteredCharacters(char character, int repetitions, int width) {
		
		int startIndex = (width - repetitions) / 2 ; //The index the character should first occur
		
		for(int i = 0; i < width - startIndex; i++) {
			if((startIndex > i)) {
				System.out.print(' ');
			} else {
				System.out.print(character);
			}
		}
		System.out.println("");
	}
}
