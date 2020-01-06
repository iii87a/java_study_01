package ch04ActualTest04;

public class Rectangle {
	private int x; 
	private int y;
	private int width;
	private int height;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int square() {
		int area = width * height;
		return area;
	}
	
	public void show() {
		System.out.println(x + "," + y + "에서 크기가 " + width + "x" + height + "인 사각형");
	}
	
	public boolean contains(Rectangle r) {
		if( 1 <= r.x && r.x < (10 - r.x) || 1 <= r.y && r.y < (10 - r.y)) {
			return true;
		}
		return false;
	}
	
}
