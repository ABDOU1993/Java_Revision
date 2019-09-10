package examples;

import java.util.ListResourceBundle;

public class ResBundle extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return contents;
	}

	static final Object[][] contents = { 
			{ "MovieName", "Avatar" }, 
			{ "GrossRevenue", (Long) 2782275172L },
			{ "Year", (Integer) 2009 } 
	};
}
