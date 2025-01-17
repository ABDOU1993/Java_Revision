package example6;

import example4.Shape;

public class StatusReporter {

	static Shape.Color getDescriptiveColor(final Shape.Color color) {
		
		// ---------------- Local Inner Classes -------------
		
		/*
		 * class DescriptiveColor extends Shape.Color { public String toString() {
		 * return "You selected a color with RGB values" + color; } }
		 */

		// color=null;
		// The final local variable color cannot be assigned.
		// It must be blank and not using a compound assignment

		// return new DescriptiveColor();
		
		// ---------------- Anonymous Inner Classes -------------

		// note the use of anonymous inner classes here // -- specifically, there is no
		// name for the class and we construct // and use the class "on the fly" in the
		// return statement!
		return new Shape.Color() {
			public String toString() {
				return "You selected a color with RGB values" + color;
			}
		};
	}

	//

	public static void main(String[] args) {
		Shape.Color descriptiveColor = 
				StatusReporter.getDescriptiveColor(new Shape.Color(1, 0, 0));
		System.out.println(descriptiveColor);
	}

}
