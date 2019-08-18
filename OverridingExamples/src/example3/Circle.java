package example3;

public class Circle {

	private int x;
	private int y;
	private int radius;

	public Circle(int x, int y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public boolean equals(Object arg0) {

		if (arg0 == null)
			return false;
		if (this == arg0)
			return true;

		if (arg0 instanceof Circle) {
			Circle anotherCircle = (Circle) arg0;

			if (this.x == anotherCircle.x && this.y == anotherCircle.y && this.radius == anotherCircle.radius) {
				return true;
			}
		}

		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (7 * x) ^ (11 * y) ^ (53 * y);
	}

}
