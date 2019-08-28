package example5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class Test {
	public static void main(String[] args) {

		System.out.println("My zone id is: " + ZoneId.systemDefault());
		System.out.println(ZoneId.of("America/Indiana/Marengo"));
		System.out.println("\\\\\\\\\n");

		// Set<String> zones = ZoneId.getAvailableZoneIds();
		// System.out.println("Number of available time zones is: " + zones.size());
		// zones.forEach(System.out::println);

		LocalDate currentDate = LocalDate.now();
		LocalTime currentTime = LocalTime.now();
		ZoneId myZone = ZoneId.systemDefault();
		ZonedDateTime zonedDateTime = ZonedDateTime
				.of(currentDate, currentTime, myZone);
		System.out.println(zonedDateTime);
	}
}
