package example1;

public class Counter {

	private static int counter;

	static {
		// code in this static block will be executed when
		// the JVM loads the class into memory
		counter = 1;
	}

	public Counter() {
		counter++;
	}

	public static void numbersOfInstance() {
		System.out.println("Number of Instances is :  " + counter);
	}

}
