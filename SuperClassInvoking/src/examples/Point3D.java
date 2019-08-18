package examples;

public class Point3D extends Point2D {
	
	private int zPos;

	public Point3D(int x,int y, int zPos) {
		super(x,y);
		this.zPos = zPos;
	}

	@Override
	public String toString() {
		return super.toString() + "zPos = "+zPos;
	}
	
	
	

}
