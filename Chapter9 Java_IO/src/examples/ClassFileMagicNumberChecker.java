package examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class ClassFileMagicNumberChecker {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Pass a valid file name as argument");
			System.exit(-1);
		}
		String fileName = args[0];
		byte[] magicNumber = { (byte) 0xCA, (byte) 0xFE, (byte) 0xBA, (byte) 0xBE };

		try (FileInputStream fis = new FileInputStream(fileName)) {
			byte[] u4buffer = new byte[4];
			if (fis.read(u4buffer) != -1) {
				if (Arrays.equals(magicNumber, u4buffer)) {
					System.out.printf("The magic number for passed file " 
				+ "%s matches  that of a .class file",
							fileName);
				} else {
					System.out.printf("The magic number for passed file " 
				+ "%s does not match that of a .class file",
							fileName);
				}
			}
		} catch (FileNotFoundException fnfe) {
			System.err.println("file does not exist with the given file name ");
		} catch (IOException ioe) {
			System.err.println("an I/O error occurred while processing the file");
		}
	}

}
