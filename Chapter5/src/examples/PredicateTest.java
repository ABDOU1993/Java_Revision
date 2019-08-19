package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateTest {

	public static void main(String[] args) {

		List<String> greeting = new ArrayList<>();
		greeting.add("hello");
		greeting.add("world");
		greeting.removeIf(((Predicate<String>)str -> str.startsWith("h")).negate());
		greeting.forEach(System.out::println);

	}

}
