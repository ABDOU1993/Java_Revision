package example1;

import java.util.HashSet;
import java.util.Set;

public class Point {

	private int xPos;
	private int yPos;

	public Point(int xPos, int yPos) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
	}

	@Override
	public boolean equals(Object other) {

		if (other == null)
			return false;
		// check if the dynamic type of 'other' is Point
		// if 'other' is of any other type than 'Point', the two objects cannot be
		// equal if 'other' is of type Point (or one of its derived classes), then
		// downcast the object to Point type and then compare members for equality
		if (other instanceof Point) {
			Point anotherPoint = (Point) other;
			if ((xPos == anotherPoint.xPos) && (yPos == anotherPoint.yPos))
				return true;
		}

		return false;

	}
	
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (7*xPos) ^ (11 *yPos);
	}

	@Override
	public String toString() {
		return "xPos--->" + xPos + ", yPos--->" + yPos;
	}

	public static void main(String[] args) {

		// Object obj = new Point(1, 2);
		// System.out.println(obj.toString());

		// Point p1 = new Point(10, 20);
		// Point p2 = new Point(50, 100);
		// Point p3 = new Point(10, 20);

		// System.out.println("p1 equals p2 is " + p1.equals(p2));
		// System.out.println("p1 equals p3 is " + p1.equals(p3));
		
		Set<Point> pointsList = new HashSet<Point>();
		pointsList.add(new Point(10, 20));
		
		System.out.println(pointsList.contains(new Point(10, 20)));
	}

}
