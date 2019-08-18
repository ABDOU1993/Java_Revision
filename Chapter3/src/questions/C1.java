package questions;

public class C1 {

	private boolean isDisplayed;
	protected int canvasID;

	public C1() {
		isDisplayed = false;
		canvasID = 0;
	}

	public class C3 {
		public void display() {
			System.out.println("isDisplayed: " + isDisplayed);
			System.out.println("canvasID: " + canvasID);
		}
	}

}
