package TestCh05;

public class Point {
	private int x;
	private int y;
	

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
	
}
