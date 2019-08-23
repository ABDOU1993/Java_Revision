package example2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScanInt3 {

	public static void main(String[] args) {

		System.out.println("Type an integer in the console: ");
		Scanner consoleScanner = new Scanner("");
		try {
			System.out.println("You typed the integer value: " + consoleScanner.nextInt());
		} catch (InputMismatchException e) {
			System.out.println("Error: You typed some text that is not an integer value...");
		} catch (NoSuchElementException nsee) {
			System.out.println("Error: Cannot scan an integer from the given string");
		} catch (IllegalStateException ise) {
			System.out.println("Error: nextInt() called on a closed Scanner object");
		}

	}

}
