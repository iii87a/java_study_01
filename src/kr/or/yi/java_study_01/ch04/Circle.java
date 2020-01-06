package kr.or.yi.java_study_01.ch04;

public class Circle extends Object{ //extends Object 생략
	public int radius; //int = 0으로 초기화
	public String name; // string (참조타입 ) null 로 초기화
	
	public Circle() { //생성자1
		super();//생략 가능 , object의 생성자를 호출 
		//-> circle 클래스의 부모는 object
	}
	
	public Circle(String name) {//생성자2 
		this.name = name;
	}

	public Circle(int radius, String name) { //overriding -> constructor using field	super();
	//생성자3
		this.radius = radius;
		this.name = name;
	}

	public Circle(int radius) {//생성자4
		this.radius = radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getArea() {
		return 3.14 * radius * radius;
		
	}

	@Override
	public String toString() {
		return String.format("Circle [%s, %s, %.2f]", radius, name, getArea());
	}

}
