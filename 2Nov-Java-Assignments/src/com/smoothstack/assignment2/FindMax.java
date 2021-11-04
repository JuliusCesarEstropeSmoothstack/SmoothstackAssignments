/**
 * 
 */
package com.smoothstack.assignment2;

import java.util.Random;

/**
 * @author Julius Cesar Estrope
 *
 */
public class FindMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindMax fm = new FindMax();
		
		int[][] random2dArray = fm.generateRandom2dIntArray(0, 10000, 5, 3);
		int[][] fixed2dArray = new int[][] 
			{
				{5, -10, 3},
				{7, 12, -99},
				{-7, -6, 4}
			};
		
		System.out.println("The max in random array is: " + fm.findMax(random2dArray));
		System.out.println("The max in fixed array is: " + fm.findMax(fixed2dArray));

	}

/**** HELPER FUNCTIONS ****/
	
	/*
	 * Generates a random 2D Array of integers. 
	 * lowerBound - integer value that must be smaller than upperBound
	 * upperBound - integer value that must be greater than lowerBound
	 * arrayWidth - integer value that must be greater than 0
	 * arrayLength - integer value that must be greater than 0
	 */
	private int[][] generateRandom2dIntArray(int lowerBound, int upperBound, int arrayWidth, int arrayLength) {
		Random random = new Random();
		int[][] randomIntArray = new int[arrayWidth][arrayLength];

		for (int i = 0; i < arrayWidth; i++) {
			for (int j = 0; j < arrayLength; j++) {
				randomIntArray[i][j] = random.nextInt(upperBound + 1) + lowerBound;
			}
		}

		return randomIntArray;
	}
	
	/*
	 * Finds the maximum value within a given 2D array
	 */
	private int findMax(int[][] intArray2D) {
		Integer max = intArray2D[0][0];
		Integer i = 0, j = 0;
		Integer maxIndexI = 0, maxIndexJ = 0;

		for (int[] intArray : intArray2D) {
			for (int integer : intArray) {
				if (integer > max) {
					max = integer;
					maxIndexI = i;
					maxIndexJ = j;
				}
				j++;
			}
			j = 0;
			i++;
		}
		System.out.println("Max found at index: " + maxIndexI + ", " + maxIndexJ);
		return max;
	}

}
