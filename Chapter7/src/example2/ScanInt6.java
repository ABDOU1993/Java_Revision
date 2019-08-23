package example2;

import java.util.Scanner;

public class ScanInt6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
				
		try {
			System.out.println("Enter a :");
			int a = s.nextInt();
			System.out.println("Enter b :");
			int b = s.nextInt();
			int sum = a+b;
			System.out.println("sum = "+sum);
			System.out.println("Closing the scanner !");
			s.close();
		} catch (Exception e) {
			System.out.println("Something is wrong ! ");
		}

	}

}
