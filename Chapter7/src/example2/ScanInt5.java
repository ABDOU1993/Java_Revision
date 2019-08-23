package example2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScanInt5 {

	public static void main(String[] args) {

		System.out.println("Type an integer in the console: ");
		Scanner consoleScanner = new Scanner("");
		try {
			System.out.println("You typed the integer value: " + consoleScanner.nextInt());
		} catch (NoSuchElementException | IllegalStateException nsee) {
			System.out.println("Error: An error occured while attempting to scan the integer");
		} 

	}

}
