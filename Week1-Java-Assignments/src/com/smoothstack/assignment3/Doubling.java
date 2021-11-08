package com.smoothstack.assignment3;

/**
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Julius Cesar Estrope
 *
 */
public class Doubling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (Integer integer : doubling(Arrays.asList(new Integer[] { 1, 2, 3 }))) {
			System.out.println(integer);
		}

		System.out.println();
		for (Integer integer : doubling(Arrays.asList(new Integer[] { 6, 8, 6, 8, -1 }))) {
			System.out.println(integer);
		}
	}

	/*
	 * Accepts a list of integers, and returns a new list of integers where each
	 * original integer is multiplied by 2
	 */
	public static List<Integer> doubling(List<Integer> integerList) {
		List<Integer> rightIntegerList = new ArrayList<>();

		for (Integer integer : integerList) {
			rightIntegerList.add(integer *= 2);
		}

		return rightIntegerList;
	}

}
