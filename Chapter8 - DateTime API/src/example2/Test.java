package example2;

import java.time.LocalTime;

public class Test {

	public static void main(String[] args) {
		
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		
		System.out.println(LocalTime.of(18, 30));
		System.out.println(currentTime.plusHours(7));
	}

}
