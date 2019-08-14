package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateHelper {

	public String getToDayWithFormatter(String formatter) {
		DateTimeFormatter format = 
				  DateTimeFormatter.ofPattern(formatter)
				  .withLocale(Locale.US);
		
		LocalDateTime now = LocalDateTime.now();
		
		return now.format(format);
	}

}
