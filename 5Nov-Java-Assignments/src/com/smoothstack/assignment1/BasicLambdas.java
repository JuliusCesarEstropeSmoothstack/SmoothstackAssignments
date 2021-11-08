/**
 * 
 */
package com.smoothstack.assignment1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Julius Cesar Estrope
 *
 */
public class BasicLambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BasicLambdas bl = new BasicLambdas();
		
		String[] stringArray = new String[] {
				"echidna", "maple", "Aardvark", "Zealous"
		};
		
		System.out.println("Original string and order: ");
		for(String string : stringArray) {
			System.out.println(string);
		}
		
		stringArray = bl.sortStringArrayLengthAscending(stringArray);
		
		System.out.println("After length sorting: ");
		for(String string : stringArray) {
			System.out.println(string);
		}
		
		stringArray = bl.sortStringArrayLengthDescending(stringArray);
		
		System.out.println("After reverse length sorting: ");
		for(String string : stringArray) {
			System.out.println(string);
		}
		
		stringArray = bl.sortStringArrayByFirstChar(stringArray);
		
		System.out.println("After sorting by first character: ");
		for(String string : stringArray) {
			System.out.println(string);
		}
		
		stringArray = bl.sortStringArrayByCharacter(stringArray, 'e');
		
		System.out.println("After sorting by 'e' first: ");
		for(String string : stringArray) {
			System.out.println(string);
		}
		
		stringArray = bl.sortStringArrayByCharacterWithUtil(stringArray, 'e');

		System.out.println("After sorting by 'e' first with utility function: ");
		for(String string : stringArray) {
			System.out.println(string);
		}

	}

	/*
	 * Sorts strings by ascending length order
	 */
	public String[] sortStringArrayLengthAscending(String[] stringArray) {
		Arrays.sort(stringArray, (s1, s2) -> s1.length() - s2.length());
		return stringArray;
	}

	/*
	 * Sorts strings by descending length order
	 */
	public String[] sortStringArrayLengthDescending(String[] stringArray) {
		Arrays.sort(stringArray, (s1, s2) -> s2.length() - s1.length());
		return stringArray;
	}

	/*
	 * Sorts strings alphabetically by the first letter in the string
	 */
	public String[] sortStringArrayByFirstChar(String[] stringArray) {
		Arrays.sort(stringArray, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
		return stringArray;
	}

	/*
	 * Sorts strings by ascending order, except it prioritizes strings starting with the specified character
	 */
	public String[] sortStringArrayByCharacter(String[] stringArray, Character character) {
		Comparator<String> charComparator = (String s1, String s2) ->{
			// Keep order if current element starts with character and next element does not
			if(s1.charAt(0) == character && s2.charAt(0) != character) { 
				return -1;
			}
			// Swap order if next element starts with character and current element does not
			if(s2.charAt(0) == character && s1.charAt(0) != character) { 
				return 1;
			}
			// Swap order according to ascii value
			return s1.compareTo(s2);
		};
		
		Arrays.sort(stringArray, charComparator);
		return stringArray;
	}

	/*
	 * Sorts strings by ascending order, except it prioritizes strings starting with the specified character
	 */
	public String[] sortStringArrayByCharacterWithUtil(String[] stringArray, Character character) {
		Arrays.sort(stringArray, (s1, s2) -> Utils.compareByCharacter(s1, s2, character));
		return stringArray;
	}

}
