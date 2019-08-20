package DataExtraction;

import java.util.stream.Stream;

public class example1 {

	public static void main(String[] args) {

		long count = Stream.of(1, 2, 3, 4, 5)				
				.peek(i -> System.out.printf("%d ", i))
				.map(i -> i * i)				
				.peek(i -> System.out.printf("%d ", i))
				.count();
				
		//System.out.printf("The stream has %d elements", count);

	}

}
