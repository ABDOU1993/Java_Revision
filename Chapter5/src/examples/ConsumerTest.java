package examples;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.Stream;

public class ConsumerTest {

	public static void main(String[] args) {

		Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
		printUpperCase.accept("hello");

		// Primitive Version of Consumer Interface Example
		IntConsumer test = a -> System.out.println(a + 2);
		test.accept(2);
	}

}
