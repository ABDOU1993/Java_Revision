package example;

public class Circle extends Shape {

	private int radius;

	public Circle(int r) {
		radius = r;
	}

	// other constructors
	
	public double area() {
		return Math.PI * radius * radius;
	}
	// other declarations
	
	
	// method overloading example
	
	public void fillColor(int red, int green, int blue) {
		
	}
	
	public void fillColor(float hue, float stauration, float brightness) {
		
	}
}
