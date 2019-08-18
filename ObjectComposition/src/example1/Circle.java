package example1;

public class Circle {

	private int radius;
	private Point center;
	
	public Circle(int x, int y, int r) {
		super();
		this.radius = r;
		this.center = new Point(x,y);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", center=" + center + "]";
	}
	
	
	
	
}
