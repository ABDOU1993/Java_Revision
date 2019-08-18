package example;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s1 = new Circle(5);
		Shape s2 = new Square(4);
		
		System.out.println("Square area : "+s2.area());
		System.out.println("Circle area : "+s1.area());

	}

}
