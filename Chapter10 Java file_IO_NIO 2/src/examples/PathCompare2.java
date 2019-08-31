package examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCompare2 {

	public static void main(String[] args) throws IOException {

		Path path1 = Paths.get("src");
		Path path2 = Paths.get(
				"C:\\Users\\abdelmonaim\\eclipse-workspace" 
		+ "\\Java Revision\\Chapter10 Java file_IO_NIO 2\\src");
		System.out.println("Files.isSameFile(path1, path2) is: " 
				+ Files.isSameFile(path1, path2));

	}

}
