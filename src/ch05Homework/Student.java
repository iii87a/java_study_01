package ch05Homework;

public class Student {
	private String name;//학생이름
	private int ban; 
	private int kor;
	private int eng;
	private int math;
	
	public int getTotal() {
		int result = this.kor + this.eng + this.math;
		return result;
	}
	
	public float getAverage() {
		float result = getTotal()/3;
		return result;
	}
}
