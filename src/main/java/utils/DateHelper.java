package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateHelper {

	public String getToDayWithFormatter(String formatter) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(formatter);
		LocalDateTime today = LocalDateTime.now();
		return dtf.format(today);
	}

}
