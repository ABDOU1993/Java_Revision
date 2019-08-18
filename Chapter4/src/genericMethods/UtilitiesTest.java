package genericMethods;

import java.util.ArrayList;
import java.util.List;

public class UtilitiesTest {

	public static void main(String[] args) {
		
		// This program demonstrates generic methods

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(20);
		System.out.println("The original list is: " + intList);
		Utilities.fill(intList, 100);
		System.out.println("The list after calling Utilities.fill() is: " + intList);

	}

}
