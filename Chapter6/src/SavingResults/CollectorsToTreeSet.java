package SavingResults;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectorsToTreeSet {

	public static void main(String[] args) {

		String[] roseQuote = "k n a o b d".split(" ");
		Set words = Arrays.stream(roseQuote)
				.collect(Collectors.toCollection(TreeSet::new));
		words.forEach(System.out::println);

	}

}
