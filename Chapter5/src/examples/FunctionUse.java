package examples;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionUse {

	public static void main(String[] args) {

		// Function<Integer, Integer> test1 = Math::abs;

		// Primitive Version
		IntFunction test1 = Math::abs;
		System.out.println(test1.apply(-10));
	}

}
