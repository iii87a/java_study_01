package kr.or.yi.java_study_01.ch05.abstractMethod;

public class Line extends Shape{

	@Override //annotation 생략가능 
	public void draw() {
		// TODO Auto-generated method stub
		//super.draw();
		System.out.println("Line");
	} //오버라이딩 메서드 이름 바꾸면 오버라이딩이 아니라 해당 이름의 새로운 메서드가 
	//하나 더 추가 되는 것임
	
}
