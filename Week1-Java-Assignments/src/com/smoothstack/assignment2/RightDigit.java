/**
 * 
 */
package com.smoothstack.assignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Julius Cesar Estrope
 *
 */
public class RightDigit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (Integer integer : rightDigit(Arrays.asList(new Integer[] { 1, 22, 93 }))) {
			System.out.println(integer);
		}

		System.out.println();
		for (Integer integer : rightDigit(Arrays.asList(new Integer[] { 16, 8, 886, 1 }))) {
			System.out.println(integer);
		}

		System.out.println();
		for (Integer integer : rightDigit(Arrays.asList(new Integer[] { 10, 0 }))) {
			System.out.println(integer);
		}

	}

	/*
	 * Takes a list of non-negative integers and returns a new list of the rightmost
	 * digit of those integers
	 */
	public static List<Integer> rightDigit(List<Integer> integerList) {
		List<Integer> rightIntegerList = new ArrayList<>();

		for (Integer integer : integerList) {
			rightIntegerList.add(integer % 10);
		}

		return rightIntegerList;
	}

}
