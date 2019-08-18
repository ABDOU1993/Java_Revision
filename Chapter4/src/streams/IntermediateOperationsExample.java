package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermediateOperationsExample {

	public static void main(String[] args) {

		/*
		 * Stream.of(1,2,3,4,5) .peek(a -> System.out.println(a)) .map(a->a+a) .peek(a
		 * -> System.out.println(a)) .count();
		 */
		/*
		 * IntStream chars = "bookkeep".chars(); System.out.println(chars.count());
		 * chars.distinct().sorted().forEach(ch -> System.out.printf("%c ", ch));
		 */

		IntStream.rangeClosed(1, 5).forEach(System.out::println);
		//"abracadabra".chars().distinct().peek(ch -> System.out.printf("%c ", ch)).sorted().count();
		DoubleStream nums = DoubleStream.of(1.0, 2.0, 3.0).map(i -> -i); // #1 
		System.out.printf("count = %f",nums.sum());
	}

}
