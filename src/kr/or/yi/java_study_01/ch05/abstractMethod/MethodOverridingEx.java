package kr.or.yi.java_study_01.ch05.abstractMethod;

public class MethodOverridingEx {

	static void paint(Shape p) {
		p.draw();
	}
	
	public static void main(String[] args) {
		array_to();
		Shape start, last, obj;
		
		

	}

	private static void array_to() {
		Line line = new Line();
		Shape[] shapes = {line, new Rect(), new Circle()};
		
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
