package example1;

public final class ImmutableCircle {

	private final Point center;
	private final int radius;

	public ImmutableCircle(int x, int y, int r) {
		center = new Point(x, y);
		radius = r;
	}

	public Point getCenter() {
		return new Point(center.getxPos(), center.getyPos());
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public String toString() {
		return "ImmutableCircle [center=" + center + ", radius=" + radius + "]";
	}

}
