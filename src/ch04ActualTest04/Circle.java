package ch04ActualTest04;

public class Circle {
	private double x;
	private double y;
	private int radius;
	
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("(" + x + "," + y + ")" + getRadius());
	}
	

	public int getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}
	
	@Override
	public String toString() { //필드 정보 , 면적 정보 
		return String.format("[x=%s y=%s r=%s area=%.2f]", x, y, radius, getArea());
	}
	
	
	

	
}
