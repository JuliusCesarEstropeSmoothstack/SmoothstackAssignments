/**
 * A class containing a method that returns a comma separated string based on a list of integers
 */
package com.smoothstack.assignment2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * @author Julius Cesar Estrope
 *
 */
public class CommaSeparatedString {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<Integer> integerList = new ArrayList<>();
		CommaSeparatedString css = new CommaSeparatedString();
		
		System.out.println("Please enter a list of integers separated by a space then press enter. "
				+ "\nAfter, press CTRL + Z or terminate button to unblock.");
		
		while(scanner.hasNext()) {
			Integer input = scanner.nextInt();
			System.out.println(input);
			try {
				integerList.add(input);
			} catch (InputMismatchException ime){
				 System.out.println("Unexpected non-integer input found. Skipping. " + scanner.next());
			}
		}
		
		System.out.println("Generated String: " + css.commaSeparatedString(integerList));
		
		scanner.close();

	}

	public String commaSeparatedString(List<Integer> integerList) {
		StringBuilder sb = new StringBuilder();
		for (Integer integer : integerList) {
			// Lambda expression: If the integer is even, append 'e' to the StringBuilder
			// If the integer is odd, append 'o' to the StringBuilder
			sb.append((integer % 2 == 0) ? 'e' : 'o');
			sb.append(integer);
			sb.append(',');
		}
		sb.deleteCharAt(sb.length() - 1); // Remove the extraneous ',' from the StringBuilder

		return sb.toString();
	}

}
