package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		ArrayList<String> playersList = new ArrayList<String>();
		playersList.add("CR7");
		playersList.add("messi");
		playersList.add("Sara");

		// with foreach
		/*
		 * for (String string : playersList) { System.out.println(string.toString()); }
		 */
		
		// With Iterator 
		
		for (Iterator<String> playerIter = playersList.iterator(); playerIter.hasNext();) {
			String player = playerIter.next();
			System.out.println(player);
		}

	}

}
