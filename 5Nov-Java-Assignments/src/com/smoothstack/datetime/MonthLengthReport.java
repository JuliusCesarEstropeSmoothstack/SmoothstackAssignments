/**
 * Reports the length of each month in a given year
 */
package com.smoothstack.datetime;

import java.time.LocalDateTime;
import java.time.Year;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Julius Cesar Estrope
 *
 */
public class MonthLengthReport {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Length of each month this year:");
		for(Integer integer : getMonthLengthReport(LocalDateTime.now().getYear())) {
			System.out.println(integer);
		}

	}
	
	public static List<Integer> getMonthLengthReport(Integer year) {
		List<Integer> monthLengthReport = new ArrayList<>();
		
		for(int i = 1; i <= 12; i++) {
			monthLengthReport.add(YearMonth.of(year, i).lengthOfMonth());
		}
		
		return monthLengthReport;
	}

}
