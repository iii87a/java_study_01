package kr.or.yi.java_study_01.ch05;

public class ColorPoint extends Point {

	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
	
	
}
