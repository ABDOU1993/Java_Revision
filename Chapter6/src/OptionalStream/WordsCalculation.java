package OptionalStream;

import java.util.Arrays;

public class WordsCalculation {

	public static void main(String[] args) {

		String[] string = "you aever know what you have until you clean your room".split(" ");
		System.out.println(Arrays.stream(string).min(String::compareTo).get());

	}

}
