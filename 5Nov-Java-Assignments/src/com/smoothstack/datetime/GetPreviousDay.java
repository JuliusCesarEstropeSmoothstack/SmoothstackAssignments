package com.smoothstack.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import static java.time.temporal.TemporalAdjusters.previous;

public class GetPreviousDay {
	
	public static void main(String[] args) {
		// previousDayToFind < currentDayOfWeek
		System.out.println("Last Wednesday's Date: " + getPreviousDay(LocalDate.now(), DayOfWeek.WEDNESDAY));
		
		// previousDayToFind > currentDayOfWeek
		System.out.println("Last Friday's Date: " + getPreviousDay(LocalDate.now(), DayOfWeek.FRIDAY));
		
		// One week before currentDayOfWeek
		System.out.println("Last Friday's Date: " + getPreviousDay(LocalDate.of(1998, 1, 21), DayOfWeek.WEDNESDAY));
	}

	/*
	 * Find the date of the last occurrence of the specified day
	 */
	public static LocalDate getPreviousDay(LocalDate date, DayOfWeek previousDayToFind) {
//		Integer daysToSubtract = 0;
//		DayOfWeek currentDayOfWeek = date.getDayOfWeek();
//		daysToSubtract = currentDayOfWeek.getValue() <= previousDayToFind.getValue()
//				? 7 - previousDayToFind.getValue() + currentDayOfWeek.getValue()
//				: currentDayOfWeek.getValue() - previousDayToFind.getValue();
//		
//		return date.minusDays(daysToSubtract);
		// Found this as an alternative solution while looking into other things
		return date.with(previous(previousDayToFind));
	}

}
