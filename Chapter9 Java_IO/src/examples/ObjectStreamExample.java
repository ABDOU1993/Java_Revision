package examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class ObjectStreamExample {
	public static void main(String[] args) {

		Map<String, String> persons = new HashMap<String, String>();
		persons.put("abdou", "salhaoui");
		persons.put("bouchra", "ben zahir");

		try (ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("object.data"))) {
			oos.writeObject(persons);
		} catch (FileNotFoundException e) {
			System.err.println("cannot create "
					+ "a file with the given file name ");
		} catch (IOException e) {
			System.err.println("an I/O error occurred "
					+ "while processing the file");
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("object.data"))) {

			Object obj = ois.readObject();
			// first check if obj is of type Map
			if (obj != null && obj instanceof Map) {
				Map<?, ?> presidents = (Map<?, ?>) obj;
				System.out.println("Vorname \tNachname");
				for (Map.Entry<?, ?> president : presidents.entrySet()) {
					System.out.printf("%s \t %s %n", president.getKey(), president.getValue());
				}
			}
		} catch (FileNotFoundException e) {
			System.err.println("cannot create a file with the given file name ");
		} catch (IOException e) {
			System.err.println("an I/O error occurred while processing the file");
		} catch (ClassNotFoundException e) {
			System.err.println("cannot recognize the class of the object "
					+ "- is the file corrupted?");
		}

	}

}
