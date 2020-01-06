package kr.or.yi.java_study_01.ch04;

public class Rectangle {
	int width;
	int height;
	
	/*
	 * public Rectangle(int width, int height) { // this.width = width; this.height
	 * = height; }
	 */

	public int getArea() {
		return width * height; 
		//ctrl + space -> height 앞에 삼각형 : default (package)
		//사각형 : private (get Area 앞에 타입)
		//마름모 : protected
		//원 : public
	}

	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
}
