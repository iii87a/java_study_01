package ch05ActualTest05;

public class Point3D extends Point {

	private int z;
	
	public Point3D(int x, int y) {
		super(x, y);
	}
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.setXY(x, y);
		this.z = z;
	}
	
	public void move(int x, int y, int z) {
		this.setXY(x, y);
		this.z = z;
		
	}

	public void moveUp() {
		this.z += 1;
		
	}

	public void moveDown() {
		this.z -= 1;
		
	}

	@Override
	public String toString() {
		return String.format("(%s, %s, %s)의 점", this.getX(), this.getY(), z);
	}

	
	
	
}
