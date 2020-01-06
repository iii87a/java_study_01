package ch04Homework;

public class Student {
	private String name; //학생 이름 
	private int ban; //번호
	private int kor; //국어점수
	private int eng; //영어점수
	private int math; //수학점수
	
	
	public int getTotal() {
		int total = this.kor + this.eng + this.math;
		return total;
	}
	
	
	
	public float getAverage() {
		int avg = getTotal()/3;
		return (Math.round(avg*100)/100);
	}
	
}


