package examples;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {
	public static void main(String[] args) {

		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("temp.data"))) {
			for (int i = 0; i < 10; i++) {
				dos.writeByte(i);dos.writeShort(i);
				dos.writeInt(i);dos.writeLong(i);
				dos.writeFloat(i);dos.writeDouble(i);
			}
		} catch (FileNotFoundException e) {
			System.err.println("cannot create a file with the given file name ");
			System.exit(-1); // don't proceed – exit the program
		} catch (IOException e) {
			System.err.println("an I/O error occurred while processing the file");
			System.exit(-1); // don't proceed – exit the program
		}

		try (DataInputStream dis = new DataInputStream(new FileInputStream("temp.data"))) {
			for (int i = 0; i < 10; i++) {
				System.out.printf("%d %d %d %d %g %g %n", 
						dis.readByte(), dis.readShort(), dis.readInt(),
						dis.readLong(), dis.readFloat(), dis.readDouble());
			}
		} catch (FileNotFoundException e) {
			System.err.println("cannot create a file with the given file name ");
		} catch (IOException ioe) {
			System.err.println("an I/O error occurred while processing the file");
		}
	}
}
