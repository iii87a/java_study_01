package kr.or.yi.java_study_01.ch05.override;

public class MethodOverridingEx {

	static void paint(Shape p) {
		p.draw();
	}
	
	public static void main(String[] args) {
		//array_to();
		Shape start, last, obj;
		
		start = new Line();
		last = start;
		obj = new Rect();
		last.next = obj; 
		last = obj; 
		obj = new Line();
		last.next = obj;
		last = obj;
		obj = new Circle();
		last.next = obj;
		
		//모든 도형 출력
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next; 
		}
		

	}

	private static void array_to() {
		Line line = new Line();
		Shape[] shapes = {new Line(), new Shape(), new Rect(), new Circle()};
		
		for(Shape s : shapes) {
			paint(s);
		}
//		Line line = new Line();
		
//		paint(line);
//		paint(new Shape());
//		paint(new Line());
//		paint(new Rect());
	}

}
