package example5;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CustomTimePatterns {

	public static void main(String[] args) {

		String[] timeFormats = { 
				"h:mm", /* h is hour in am/pm (1-12), m is minute */
				"hh 'o''clock'", /* '' is the escape sequence to print a single quote */
				"H:mm a", /* H is hour in day (0-23), a is am/pm */
				"hh:mm:ss:SS", /* s is seconds, S is milliseconds */
				"K:mm:ss a" /* K is hour in am/pm(0-11) */
		};

		LocalTime now = LocalTime.now();
		for (String timeFormat : timeFormats) {
			System.out.printf("Time in pattern \"%s\" is %s %n", timeFormat,
					DateTimeFormatter.ofPattern(timeFormat).format(now));
		}

	}

}
