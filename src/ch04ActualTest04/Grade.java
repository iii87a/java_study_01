package ch04ActualTest04;

public class Grade {
	private int math;
	private int science;
	private int eng;
	
	
	public Grade() {//생성자
		// TODO Auto-generated constructor stub
	}


	public Grade(int math, int science, int eng) {
		this.math = math;
		this.science = science;
		this.eng = eng;
	}



	public int avg() {
		int avg =(math + science + eng)/3;
		return avg;
	}
	
}
