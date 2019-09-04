package examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) throws IOException {

		Path aPath = Paths.get("D:\\OCPJP\\programs\\..\\NIO2\\src\\.\\SubPath.java");
		aPath = aPath.normalize();
		System.out.println(aPath);
	}

}
