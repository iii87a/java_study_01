package kr.or.yi.java_study_01.ch05;

public class Student extends Person{
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175; 
		//weight = 99;
		setWeight(99);
	}
}
