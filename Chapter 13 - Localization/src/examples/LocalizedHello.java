package examples;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalizedHello {
	public static void main(String[] args) {

		Locale.setDefault(Locale.GERMANY);
		Locale currentLocale = Locale.getDefault();
		
		ResourceBundle resBundle = ResourceBundle
				.getBundle("ResourceBundle", currentLocale);
		System.out.printf(resBundle.getString("Greeting"));

	}

}
