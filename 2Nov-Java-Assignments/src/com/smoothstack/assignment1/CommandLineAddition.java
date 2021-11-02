/**
 * Add numbers from the command line
 * Exit code 1 indicates an invalid input from the command line arguments
 */
package com.smoothstack.assignment1;

/**
 * @author Julius Cesar Estrope
 *
 */
public class CommandLineAddition {

	/**
	 * @param args - A series of numbers that the program will add together NOTE:
	 *             Invalid command line input will result in the program telling the
	 *             user the input is invalid, and exiting the program with code 1
	 */
	public static void main(String[] args) {
		float total = 0;
		for (String arg : args) {
			try {
				total += Float.parseFloat(arg);
			} catch (NumberFormatException nfe) {
				System.out.println(
						nfe.getMessage() + "\nArguments contain a non-number. Please only input float values.");
				System.exit(1); // The program was unable to add the command line arguments due to an invalid input
			}
		}

		System.out.println("The total is: " + total);
	}

}
