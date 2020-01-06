package ch05ActualTest05;

public class PointEx {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,5, "YELLOW");
		cp.setXY(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
		
		
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString());
		
		ColorPoint cp1 = new ColorPoint(10, 10);
		cp1.setXY(5, 5);
		cp1.setColor("RED");
		System.out.println(cp1.toString() + " 입니다.");
		
		Point3D p = new Point3D(1,2,3);
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();
		System.out.println(p.toString() + " 입니다.");
		
		p.moveDown();
		System.out.println(p.toString() + " 입니다.");
		
		p.move(10, 10);
		System.out.println(p.toString() + " 입니다.");
		
		p.move(100, 200, 300);
		System.out.println(p.toString() + " 입니다.");
		
		PositivePoint p1 = new PositivePoint();
		p1.move(10, 10);
		System.out.println(p1.toString()+" 입니다.");
		System.out.println("===========");
		System.out.println(p1);
		p1.move(-5, 5);
		System.out.println(p1.toString()+" 입니다.");
		
		PositivePoint p2 = new PositivePoint();
		p2.move(-10, -10);
		System.out.println(p2.toString()+" 입니다.");
		
		p2.move(10, -10);
		System.out.println(p2.toString()+" 입니다.");
		
		
	}

}
