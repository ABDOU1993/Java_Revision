package example3;

import java.time.LocalDateTime;

public class LocalDateTimeUse {

	public static void main(String[] args) {

		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("Today's date-time is: " + currDateTime);

		LocalDateTime d1 = LocalDateTime.of(2015, 12, 25, 0, 0);
		LocalDateTime d2 = LocalDateTime.of(2016, 1, 1, 0, 0);

		System.out.println("d2 is after d2 ? " + d2.isAfter(d1));
		System.out.println("\n");

		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Today's date and current time: " + dateTime);
		System.out.println("The date component is:  " + dateTime.toLocalDate());
		System.out.println("The time component is: " + dateTime.toLocalTime());
	}

}
