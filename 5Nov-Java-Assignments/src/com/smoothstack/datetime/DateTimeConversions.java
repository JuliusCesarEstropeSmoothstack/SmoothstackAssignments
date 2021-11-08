package com.smoothstack.datetime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeConversions {
	
	/*
	 * Takes the time since Epoch and adjusts according to the given time zone
	 * Essentially taking UTC/GMT time and adjusting for a time zone
	 */
	public static ZonedDateTime instantToZonedDateTime(Instant instant, ZoneId zoneId) {
		return instant.atZone(zoneId);
	}
	
	/*
	 * Take the given ZonedDateTime, convert to UTC/GMT, by adjusting based on the time zone defined in ZDT
	 */
	public static Instant zonedDateTimeToInstant(ZonedDateTime zdt) {
		return zdt.toInstant();
	}

}
