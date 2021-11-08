/**
 * 
 */
package com.smoothstack.assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Julius Cesar Estrope
 *
 */
public class NoX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (String string : noX(Arrays.asList(new String[] { "ax", "bb", "cx" }))) {
			System.out.println(string);
		}

		System.out.println();
		for (String string : noX(Arrays.asList(new String[] { "xxax", "xbxb", "xxcx" }))) {
			System.out.println(string);
		}

		System.out.println();
		for (String string : noX(Arrays.asList(new String[] { "x" }))) {
			System.out.println(string);
		}

	}

	/*
	 * Takes a list of strings and removes the letter "x" from each. Returns a new
	 * list of strings without the letter "x"
	 */
	public static List<String> noX(List<String> stringList) {
		List<String> noXStringList = new ArrayList<>();

		for (String string : stringList) {
			noXStringList.add(string.replaceAll("x", ""));
		}

		return noXStringList;
	}

}
