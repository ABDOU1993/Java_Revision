package example3;

import java.util.HashSet;
import java.util.Set;

import example1.Point;

public class TestCircle {

	public static void main(String[] args) {
		
		Point p = new Point(10, 20);

		Set<Circle2> circleList = new HashSet<Circle2>();
		circleList.add(new Circle2(20, p));
		System.out.println(circleList.contains(new Circle2(20, new Point(10, 20))));
	}

}
