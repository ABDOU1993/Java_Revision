package example4;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsClause4 implements IntReader {

	// implement readIntFromFile with the same throws clause 
	// or a more specific throws clause

	@Override
	public int readIntFromFile() throws IOException {
		Scanner consoleScanner = new Scanner(new File("integer.txt"));
		return consoleScanner.nextInt();
	}

	/**
	 * 
	 * @throws InputMismatchException
	 * your message ....
	 * **/
	
	public int nextInt() {
		return 0;
	}
}
