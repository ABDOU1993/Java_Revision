package example8;

public class Circle extends CircularShape {

	private int xPos, yPos, radius;

	public Circle(int xPos, int yPos, int radius) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.radius = radius;
	}

	@Override
	public void roll(float degree) {
		System.out.println("Rolling with " + degree);

	}

	@Override
	double area() {

		return Math.PI * radius * radius;
	}

	public static void main(String[] s) {
		Circle circle = new Circle(10, 10, 20);
		circle.roll(45);
		circle.test();
	}

}
