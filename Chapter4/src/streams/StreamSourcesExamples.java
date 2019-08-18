package streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSourcesExamples {

	public static void main(String[] args) {

		// IntStream.range(1, 6).forEach(a->System.out.println(a));
		
		// Arrays.stream(new int[] {10, 20, 30, 40, 50}).forEach(a->System.out.println(a));
		
		// Stream.of("abdou", "khalil", "bouchra", "soumaya").forEach(a->System.out.println(a));
		
		// Stream.builder().add(.1).add(.2).add(.3).add(.4).add("ff").build().
			// forEach(a->System.out.println(a));
		/*
		try {
			Files.lines(Paths.get("C:\\Users\\abdelmonaim\\eclipse-workspace
			\\Chapter4\\src\\streams\\test.txt")).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/	
	}

}
