package examples;

import java.util.function.Function;

public class ConstuctorRefUse {

	public static void main(String[] args) {

		Function<String, Integer> anotherInteger = Integer::new;
		System.out.println(anotherInteger.apply("100"));
	}
}
