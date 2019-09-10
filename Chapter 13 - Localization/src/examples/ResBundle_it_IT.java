package examples;

import java.util.ListResourceBundle;

public class ResBundle_it_IT extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return contents;
	}

	static final Object[][] contents = { 
			{ "MovieName", "Che Bella Giornata" }, 
			{ "GrossRevenue", (Long) 43000000L },
			{ "Year", (Integer) 2011 } 
	};

}
