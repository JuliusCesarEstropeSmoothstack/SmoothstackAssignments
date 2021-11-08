/*
 * Tests whether the given date is Friday the 13th
 */
package com.smoothstack.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SuperstitionEvaluator {
	
	public static void main(String[] args) {
		LocalDate[] datesToTest = new LocalDate[] {
				LocalDate.of(2021, 8, 13),
				LocalDate.of(2021, 11, 13),
				LocalDate.of(2021, 8, 14),
				LocalDate.of(2022, 5, 13)
		};
		
		for(LocalDate date : datesToTest) {
			System.out.println(date + " is Friday the 13th: " + isFriday13th(date));
		}
		
	}
	
	public static Boolean isFriday13th(LocalDate date) {
		return date.getDayOfWeek() == DayOfWeek.FRIDAY && date.getDayOfMonth() == 13;
	}

}
