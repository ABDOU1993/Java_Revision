package example2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScanInt1 {

	public static void main(String[] args) {

		System.out.println("Type an integer in the console: ");
		Scanner consoleScanner = new Scanner(System.in);
		try {
			System.out.println("You typed the integer value: " + consoleScanner.nextInt());
		} catch (InputMismatchException e) {
			System.out.println("Error: You typed some text that is not an integer value...");
		}

	}

}
