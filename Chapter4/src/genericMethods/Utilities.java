package genericMethods;

import java.util.List;

public class Utilities {
	
	// This program demonstrates generic methods

	public static <T> void fill(List<T> list, T val) {
		for (int i = 0; i < list.size(); i++)
			list.set(i, val);
	}

}
