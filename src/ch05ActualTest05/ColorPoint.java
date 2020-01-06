package ch05ActualTest05;

public class ColorPoint extends Point {
	
	private String color;
	
	public ColorPoint() {
		super(0,0);
		color = "BLACK";
	}

	public ColorPoint(int x, int y) {
		super(x, y);
	}
	


	
	public void setColor(String color) {
		this.color = color;
	}



	public ColorPoint(int x, int y, String color) {
		//this.setX(x);
		//this.setY(y);
		super(x, y);
		this.color = color;
	}

	


	@Override
	public String toString() {
		return String.format("%s 색의 (%s,%s)의 점", color, getX(), getY());
	}


}
