package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String pangram = "vvvvvvvffffuuuuiiaaaapppppbbbbbbddddiiiicccwww";

		// Set contains no duplicates. (TreeSet , HashSet)
		// (2) HashSet :
		// A HashSet is for quickly inserting and retrieving elements
		// it does not maintain any sorting order for the elements it holds.

		Set<Character> aToZee = new TreeSet<Character>();
		for (char gram : pangram.toCharArray())
			aToZee.add(gram);
		System.out.println("The pangram is: " + pangram);
		System.out.print("Sorted pangram characters are: " + aToZee);
		
		
	}

}
