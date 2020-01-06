package kr.or.yi.java_study_01.ch04;

public class Ch04Main {

	public static void main(String[] args) {
		//ch04_01();
		//ch04_02();
		//ch04_03();
		//ch04_04();
		
	}

	private static void ch04_04() {
		Circle ob1 = new Circle(1);
		Circle ob2 = new Circle(2);
		Circle ob3 = new Circle(3);
		
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
		
		ob1.setRadius(4);
		ob2.setRadius(5);
		ob3.setRadius(6);
		

		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob3);
	}

	private static void ch04_03() {
		Book littlePrince = new Book("어린왕자", "생택쥐베리");
		Book loveStory = new Book("춘향전");
		Book book2 = new Book();
		System.out.printf("%s : %s%n", littlePrince.title, littlePrince.author);
		System.out.printf("%s : %s%n", loveStory.title, loveStory.author);
		//-> book 클래스에서 override 로 출력
		//System.out.println(littlePrince); ->풀패키지명 + jvm에 올라가는 주소 (object 클래스에 있는  toString)
		//https://docs.oracle.com/javase/8/docs/api/
		System.out.println(littlePrince); 
		System.out.println(book2);
	}

	private static void ch04_02() {
		Rectangle rect = new Rectangle(); //디폴트 생성자
		rect.width = 4;
		rect.height = 5;
		
		System.out.printf("사각형의 면적은 %d%n ", rect.getArea());
		
		Rectangle rect2 = new Rectangle();
		System.out.printf("사각형의 면적은 %d%n ", rect2.getArea());
	}

	private static void ch04_01() {
		Circle c1 = new Circle();
		c1.name = "고르곤졸라";
		c1.radius = 100;
	//	System.out.printf("이름 %s 반지름 %d 면적 %.2f %n", c1.name, c1.radius, c1.getArea());
		System.out.println(c1);
		
		Object c2 = new Circle();
		((Circle)c2).name = "페퍼로니";
		((Circle)c2).radius = 50;
		//object 입장에서 보기때문에 밑에 있는 circle은 보이지 않음
		//circle 로 typecast 해줘야함
		//(circle)c2 -> 괄호 우선순위 때문에 ((circle)c2) 로 한번 더 감싸줘서 타입캐스트 우선순위 높임  
		//System.out.printf("이름 %s 반지름 %d 면적 %.2f %n",((Circle)c2).name, ((Circle)c2).radius,
			//	((Circle)c2).getArea());
		System.out.println(c2);
		
		Circle c3 = new Circle(30, "시카고 피자");
		System.out.println(c3);
	}

}
