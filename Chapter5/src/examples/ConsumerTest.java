package examples;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerTest {

	public static void main(String[] args) {

		Consumer<String> printUpperCase = 
				str -> System.out.println(str.toUpperCase());
		printUpperCase.accept("hello");
	}

}
