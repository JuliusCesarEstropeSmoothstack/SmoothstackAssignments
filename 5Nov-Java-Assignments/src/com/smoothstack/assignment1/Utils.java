/**
 * A Utility Class containing the sortByCharacter method
 */
package com.smoothstack.assignment1;

import java.util.Comparator;

/**
 * @author Julius Cesar Estrope
 *
 */
public class Utils implements Comparator<String>{

	/*
	 * Sorts strings by ascending order, except it prioritizes strings starting with the specified character
	 */
	public static int compareByCharacter(String s1, String s2, Character character) {
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
	}

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}

}
