package examples;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		Stream.of("hello","word","hallo")
		.filter(str->str.startsWith("h"))
		.forEach(System.out::println);

	}

}
