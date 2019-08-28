package FlightTravelExample;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate babyDOB = LocalDate.of(2015, Month.FEBRUARY, 20);
		LocalDate now = LocalDate.of(2016, Month.APRIL, 10);
		System.out.println(Period.between(now,babyDOB).getYears()); // PERIOD_CALC
	}

}
