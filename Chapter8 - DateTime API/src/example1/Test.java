package example1;

import java.time.LocalDate;
import java.time.Month;

public class Test {

	public static void main(String[] args) {

		LocalDate today = LocalDate.now();
		System.out.println("Today is : "+today);
		
		LocalDate d1 = LocalDate.of(2015, 5, 20);
		System.out.println("Date d1 : "+d1);

		LocalDate d2 = LocalDate.of(2019,Month.NOVEMBER,8);
		System.out.println("Date d2 : "+d2);
		
		System.out.println("d1 + 180 days = "+d1.plusDays(180));
	}

}
