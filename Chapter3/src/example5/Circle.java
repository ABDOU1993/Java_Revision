package example5;

public class Circle {
	
	private int a;
	
	public class Point {
		
		private int xPos;
		private int yPos;

		public Point(int xPos, int yPos) {
			this.xPos = xPos;
			this.yPos = yPos;
		}

		@Override
		public String toString() {
			return "Point [xPos=" + xPos + ", yPos=" + yPos + "]";
		}
		
		public int tt() {
			return a;
		}
	}

	private Point center;
	private int radius;

	public Circle(int x, int y, int radius) {
		// note how to make use of the inner class to instantiate it
		this.center = this.new Point(x, y);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + "]";
	}
}
