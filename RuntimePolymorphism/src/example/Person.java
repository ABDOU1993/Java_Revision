package example;

public class Person {

	private String name;
	private String nationality;
	private int age;

	public Person() {		
		this("noName","noNation",0);
	}

	public Person(String x, String y, int z) {
		name = x;
		nationality = y;
		age = z;
	}

	public Person(String x, String y) {
		this(x,y,25);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", nationality=" + nationality + ", age=" + age + "]";
	}
	
	

}
