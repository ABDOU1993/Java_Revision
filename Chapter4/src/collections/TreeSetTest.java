package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pangram = "vvvvvvvffffuuuuiiaaaapppppbbbbbbddddiiiicccwww";
		
		// Set contains no duplicates. (TreeSet , HashSet)
		// (1) TreeSet : 
		// A TreeSetstores the elements in a sorted order
		// and it implements the SortedSet interface
		
		Set<Character> aToZee = new HashSet<Character>();
		for (char gram : pangram.toCharArray())
			aToZee.add(gram);
		System.out.println("The pangram is: " + pangram);
		System.out.print("Sorted pangram characters are: " + aToZee);
	}

}
