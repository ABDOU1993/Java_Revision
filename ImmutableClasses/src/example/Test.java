package example;

public class Test {

	public static void main(String[] args) {

		String str1 = new String("contents");
		String str2 = new String("contents");
		
		System.out.println("str1 == str2 is " + (str1 == str2));
		System.out.println("str1.intern() == str2.intern() is " + (str1.intern() == str2.intern()));
	}

}
