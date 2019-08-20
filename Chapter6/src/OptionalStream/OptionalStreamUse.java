package OptionalStream;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class OptionalStreamUse {

	public static void main(String[] args) {

		// Example1
		Optional<String> string1 = Optional.of("  abracadabra  ");
		string1.map(String::trim).ifPresent(System.out::println);

		// Example2
		Optional<String> string2 = Optional.ofNullable(null);
		System.out.println(string2.map(String::length).orElse(-1));

		// Example3
		selectHighestTemperature(DoubleStream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3));
		
		// Example4 (Primitive Version of Optional<T>
		Optional<String> string = Optional.ofNullable(null);
		System.out.println(string.map(String::length).orElseThrow(IllegalArgumentException::new));
		
		
	}

	public static void selectHighestTemperature(DoubleStream temperatures) {
		OptionalDouble max = temperatures.max();
		max.ifPresent(System.out::println);
	}

}
