package example;

public class OverloadingError {
	
	public static void aMethod(byte a) {
		System.out.println("byte");
	}
	
	public static void aMethod(short b) {
		System.out.println("short");
	}
	
	public static void aMethod(double c) {
		System.out.println("double");
	}
	
	public static void aMethod(int a, long b) {
		System.out.println("int, long");
	}
	
	public static void aMethod(long a, int b) {
		System.out.println("long, int");
	}

	public static void main(String[] args) {

		aMethod(9);

	}

}
