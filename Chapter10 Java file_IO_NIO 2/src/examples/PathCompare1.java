package examples;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCompare1 {

	public static void main(String[] args) {

		Path path1 = Paths.get("test");
		Path path2 = Paths.get("C:\\Users\\abdelmonaim\\eclipse-workspace"
				+ "\\Java Revision\\Chapter10 Java file_IO_NIO 2\\test");

		System.out.println("(path1.compareTo(path2) == 0) is: " 
				+ (path1.compareTo(path2) == 0));

		System.out.println("path1.equals(path2) is: " + path1.equals(path2));
		
		//System.out.println(path1.toAbsolutePath()+"--"+path2.toAbsolutePath());

		System.out.println("path2.equals(path1.toAbsolutePath()) is " 
				+ path2.equals(path1.toAbsolutePath()));

	}

}
