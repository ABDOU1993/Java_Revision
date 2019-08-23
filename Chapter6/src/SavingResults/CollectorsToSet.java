package SavingResults;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] roseQuote = "a rose is a a a a rose is a rose".split(" ");
		
		Set words = Arrays.stream(roseQuote)
				.collect(Collectors.toSet());
		words.forEach(System.out::println);
	}

}
