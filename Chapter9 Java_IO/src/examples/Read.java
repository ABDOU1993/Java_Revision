package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read {

	public static void main(String[] args) {

		String str = "";
		
		System.out.print("Type a string: ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			str = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("You typed: " + str);
	}

}
