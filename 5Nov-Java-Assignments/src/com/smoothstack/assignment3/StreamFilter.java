/**
 * A Program that takes a list of strings and returns a list of strings starting with the letter 'a' with have 3 letters
 */
package com.smoothstack.assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Julius Cesar Estrope
 *
 */
public class StreamFilter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		StreamFilter sf = new StreamFilter();
		List<String> stringList = new ArrayList<>();

		stringList.add("Yes");
		stringList.add("aYs");
		stringList.add("Yes");
		stringList.add("no");
		stringList.add("Y1235");
		stringList.add("a234es");
		stringList.add("a@es");
		stringList.add("a2tjs");
		
		System.out.println("Filtered Strings:");
		for(String string : sf.filterStringList(stringList)) {
			System.out.println(string);
		}
		
	}
	
	public List<String> filterStringList(List<String> stringList){
		String threeLettersRegex = ".*[A-z].*[A-z].*[A-z].*"; // Any string containing exactly 3 letters
		return stringList.stream().filter(s -> s.charAt(0) == 'a').filter(s -> s.matches(threeLettersRegex)).collect(Collectors.toList());
	}

}
