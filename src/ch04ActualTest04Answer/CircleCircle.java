package ch04ActualTest04Answer;

public class CircleCircle {
	private double x;
	private double y;
	private int radius;

	public CircleCircle() {
		// TODO Auto-generated constructor stub
	}

	public CircleCircle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	@Override
	public String toString() { //필드 정보 , 면적 정보 
		return String.format("[x=%s y=%s r=%s area=%.2f]", x, y, radius, getArea());
	}
	
	
	
	
}
