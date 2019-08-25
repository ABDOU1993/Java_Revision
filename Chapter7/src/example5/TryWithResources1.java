package example5;

import java.util.Scanner;

public class TryWithResources1 {

	public static void main(String[] args) {
		
		// Try-with-resources

		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Type a number : ");
			System.out.println("you typed "+s.nextInt());
		} catch (Exception e) {
			// catch all other exceptions here ...
			System.out.println("Error: Encountered an exception and could not read an integer from the console... ");
			System.out.println("Exiting the program - restart and try the program again!");
		}

	}

}
