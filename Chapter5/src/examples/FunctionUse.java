package examples;

import java.util.Arrays;
import java.util.function.Function;

public class FunctionUse {

	public static void main(String[] args) {

		Function<String, Integer> strLength = str -> str.length();
		System.out.println(strLength.apply("Hallo Leute"));
	}

}
