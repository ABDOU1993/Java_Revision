package example;

public class TestOverloading {

	public static void sagHallo(String name) {
		System.out.println("Hallo " + name);
	}

	public static void sagHallo() {
		sagHallo("!");
	}

	public static void main(String[] args) {

		sagHallo();
		sagHallo("Abdou");
		
		System.out.println(new Person());
		System.out.println(new Person("Bouchra", "moroccan"));
		System.out.println(new Person("Sara", "moroccan", 19));
	}

}
