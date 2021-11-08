/**
 * 
 */
package com.smoothstack.assignment5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Julius Cesar Estrope
 *
 */
public class GroupSumClump {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(groupSumClump(new Integer[] {2, 4, 8}, 10)); // true
		System.out.println(groupSumClump(new Integer[] {1, 2, 4, 8, 1}, 14)); // true
		System.out.println(groupSumClump(new Integer[] {2, 4, 4, 8}, 14)); // false
	}

	/*
	 * Returns true if there is a group of ints that sum to the given target
	 * Additionally, identical adjacent values must all be chosen, or not chosen at
	 * all For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in
	 * the middle must be chosen or not, all as a group. (one loop can be used to
	 * find the extent of the identical values).
	 */
	public static Boolean groupSumClump(Integer[] intArray, Integer target) {
		
		List<Integer> realValues = new ArrayList<Integer>(); 
		Integer currentValue, sum = 0;
		
		// Find consecutive duplicate values and sum them to add to the realValues TreeSet
		for(int i = 0; i < intArray.length; i++) {
			
			currentValue = intArray[i];
			sum += currentValue;
			
			if(i < intArray.length - 1 && intArray[i + 1] == currentValue) {
				continue;
			}
			
			//Reset all values once a tempList is added to realValues
			realValues.add(sum);
			sum = 0;
		}
		realValues.sort(Comparator.reverseOrder());
		return groupSumClump(realValues, target);
		
	}
	
	/*
	 * Assumes intSet contains no consecutive duplicates and is sorted by reverse natural order
	 */
	private static Boolean groupSumClump(List<Integer> integers, Integer target) {
		Integer currentValue;
		
		for(int i = 0; i < integers.size(); i++) {
			currentValue = integers.get(i);
			if (currentValue > target){
				continue;
			}
			if (currentValue == target){
				return true;
			}
			if(i + 1 < integers.size()) {
				return groupSumClump(integers.subList(i + 1, integers.size()), target - currentValue);
			}
			
		}
		return false;
	}

}
