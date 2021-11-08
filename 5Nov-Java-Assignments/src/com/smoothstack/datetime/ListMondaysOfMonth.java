/**
 * Program that will list every Monday's date in a specified month
 */
package com.smoothstack.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Julius Cesar Estrope
 *
 */
public class ListMondaysOfMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Month month = Month.FEBRUARY;
		
		System.out.println("Printing all monday dates in + " + month + " of this year.");
		
		for(LocalDate date : getMondays(month.getValue())) {
			System.out.println(date);
		}

	}
	
	public static List<LocalDate> getMondays(Integer month) {
		
		List<LocalDate> mondaysInMonth = new ArrayList<>();
		YearMonth specifiedYearMonth = YearMonth.of(LocalDateTime.now().getYear(), month);
		LocalDate date;
		Integer incrementor = 1;

		for (int i = 1; i < specifiedYearMonth.lengthOfMonth(); i += incrementor) {
			date = specifiedYearMonth.atDay(i);
			if(date.getDayOfWeek() == DayOfWeek.MONDAY) {
				mondaysInMonth.add(date);
				if(incrementor != 7) {
					incrementor = 7;
				}
			}
		}
		
		return mondaysInMonth;
		
	}

}
