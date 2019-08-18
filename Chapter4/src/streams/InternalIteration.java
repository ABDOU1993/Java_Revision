package streams;

import java.util.Arrays;
import java.util.List;

public class InternalIteration {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("erny", "meeny", "miny", "mo");
		strings.forEach(string -> System.out.println(string));

	}

}
