/**
 * 
 */
package com.smoothstack.assignment1;

import java.security.InvalidParameterException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Julius Cesar Estrope
 *
 */
public class Lambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Boolean inputValid = false;
		Lambdas lambdas = new Lambdas();
		PerformOperation po;
		
		System.out.println("Please enter space-separated test cases. "
				+ "\nThe first number is the number of test cases."
				+ "\nThe following numbers are the test cases."
				+ "\nThe first integer is the condition to check "
				+ "\nThe second integer  is the integer being checked.");

		Integer numberOfTests = 0;
		
		while(!inputValid) {
			System.out.print("Number of Test Cases: ");
			try {
				numberOfTests = scanner.nextInt();
				inputValid = true;
			} catch (InputMismatchException ime) {
				System.out.println("Invalid input. Please enter an integer.");
			}
		}

		for(int i = 1; i <= numberOfTests; i++) {
			inputValid = false;
			while(!inputValid) {
				System.out.print("Test Case " + i + ": ");
				try {
					String answer = "";
					
					switch (scanner.nextInt()){
						case 1:
							po = lambdas.isOdd();
							answer = (checker(po, scanner.nextInt()) == 1) ? "ODD" : "EVEN";
							break;
						case 2:
							po = lambdas.isPrime();
							answer = (checker(po, scanner.nextInt()) == 0) ? "PRIME" : "COMPOSITE";
							break;
						case 3:
							po = lambdas.isPalindrome();
							answer = (checker(po, scanner.nextInt()) == 0) ? "PALINDROME" : "NON-PALINDROME";
							break;
						default:
							throw new InvalidParameterException();
					}
					
					System.out.println(answer);
					inputValid = true;
					
				} catch (InputMismatchException ime) {
					System.out.println("Invalid input. Please enter an integer.");
					continue;
				} catch (InvalidParameterException ipe) {
					System.out.println("The first argument in test case must be 1, 2, or 3 to test for odd, prime, or palindrome");
					continue;
				}
			}
		}

	}

	/*
	 * returns 1 if the number is odd, 0 if the number is even
	 */
	public PerformOperation isOdd() {
		return integer -> integer % 2;
	}

	/*
	 * returns 1 if the number is composite, 0 if a number is prime
	 */
	public PerformOperation isPrime() {
		return integer -> {
			for (int i = 2; i <= integer / 2; i++) {
				if (integer % i == 0) {
					return 1;
				}
			}
			return 0;
		};
	}

	/*
	 * Returns 0 if the number is not a palindrome
	 */
	public PerformOperation isPalindrome() {
		return integer -> {
			String numberAsString = integer.toString();
			int leftIndex = 0, rightIndex = numberAsString.length() - 1;

			while (leftIndex < rightIndex) {

				if (numberAsString.charAt(leftIndex) != numberAsString.charAt(rightIndex)) {
					return 1;
				}

				leftIndex++;
				rightIndex--;
			}
			return 0;
		};
	}
	
	public static Integer checker (PerformOperation po, Integer number) {
		return po.check(number);
	}

	public interface PerformOperation {
		Integer check(Integer a);
	}

}
