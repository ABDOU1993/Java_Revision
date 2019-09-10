package examples;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedBoxOfficeHits {

	public void printMovieDetails(ResourceBundle resBundle) {
		String movieName = resBundle.getString("MovieName");
		Long revenue = (Long) (resBundle.getObject("GrossRevenue"));
		Integer year = (Integer) resBundle.getObject("Year");
		System.out.println("Movie " + movieName + "(" + year + ")" + " grossed " + revenue);
	}

	public static void main(String[] args) {

		LocalizedBoxOfficeHits localizedHits = new LocalizedBoxOfficeHits();
		Locale locale = Locale.getDefault();
		localizedHits
			.printMovieDetails(ResourceBundle.getBundle("examples.ResBundle", locale));
		locale = new Locale("it", "IT");
		localizedHits
			.printMovieDetails(ResourceBundle.getBundle("examples.ResBundle",locale));
	}

}
