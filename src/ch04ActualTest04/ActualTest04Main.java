package ch04ActualTest04;

import java.util.Arrays;
import java.util.Scanner;

public class ActualTest04Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//1번. Tv 클래스 작성하기
		//tv();
//2번. Grade 클래스 작성하기
		//grade(sc);
//3번. 노래 한 곡을 나타내는 song 클래스 
		 // song();
//4. 직사각형을 표현하는 Rectangle 클래스
		// rec();
//5. Circle 클래스와 CircleManager 클래스 
			//circleManager(sc);
//6. CircleManager2 클래스   =========================		
			//circleManager2(sc);
//7. 하루 할일을 표현하는 Day 클래스
			//day();
//8. 이름, 전화번호 필드와 생성자 등을 가진 phone 클래스를 작성, 실행예시와 같이 작동하는 phoneBook 클래스작성
			//phone();
//9. ArrayUtil 클래스 작성
			//util();

//10. Dictionary 클래스 
			dic(sc);
		
//11.다수의 클래스 작성. 사칙연산자 (+, -, *, /) 를 수행하는 각 클래스 작성(Add, Sub, Mul, Div)
			//cal(sc);
			sc.close();

	}

	private static void cal(Scanner sc) {
		System.out.println("두 정수와 연산자를 입력하세요.");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String cal = sc.next();
		
		if(cal.equals("+")) {
			Add adding = new Add();
			adding.setValue(num1, num2);
			int result = adding.calculate();
			System.out.println(result);
		}else if(cal.equals("-")) {
			Sub	subtraction = new Sub();
			subtraction.setValue(num1, num2);
			int result = subtraction.calculate();
			System.out.println(result);
		}else if(cal.equals("*")) {
			Mul	multiple = new Mul();
			multiple.setValue(num1, num2);
			int result = multiple.calculate();
			System.out.println(result);
		}else if(cal.equals("/")) {
			Div	division = new Div();
			division.setValue(num1, num2);
			int result = division.calculate();
			System.out.println(result);
		}
		else {
			System.out.println("잘못된 연산자 입니다.");
		}
		
	}

	private static void dic(Scanner sc) {
		System.out.println("한영 단어 검색 프로그램 입니다.");
		Dictionary dicApp = new Dictionary();
		dicApp.findWord(sc);
		
	}

	private static void util() {
		int[] array1 = {1, 5, 7, 9};
		int[] array2 = {3, 6, -1, 100, 77};
		int[] array3 = ArrayUtil.concat(array1, array2);
		ArrayUtil.print(array3);
		
	}

	private static void phone() {
		PhoneBook studyMoim = new PhoneBook();
		studyMoim.nameNum();
		
	}

	private static void day() {
		MonthSchedule april = new MonthSchedule(30);
		april.run();
		
	}

	private static void circleManager2(Scanner sc) {
		Circle c[] = new Circle[3];
		//System.out.println(Arrays.toString(c));
		
		for(int i=0; i<c.length; i++) {
			System.out.println("x, y, radius >> ");
			double xValue = sc.nextDouble();
			double yValue = sc.nextDouble();
			int radValue = sc.nextInt();
			
			c[i] = new Circle(xValue, yValue, radValue);
		}
	
		//3.0 3.0 5
		//5.0 5.2 6
		//2.6 2.7 4

		
		int bigCircleIdx = 0;
		for(int i=0; i<c.length; i++) {
			if(c[bigCircleIdx].getArea() < c[i].getArea()) {
				bigCircleIdx = i;
			}
		}
		System.out.println("가장 큰 면적인 원은 : " + c[bigCircleIdx]);
		
	}

	private static void circleManager(Scanner sc) {
		Circle c[] = new Circle[3];
		//System.out.println(Arrays.toString(c));
		
		for(int i=0; i<c.length; i++) {
			System.out.println("x, y, radius >> ");
			double xValue = sc.nextDouble();
			double yValue = sc.nextDouble();
			int radValue = sc.nextInt();
			
			c[i] = new Circle(xValue, yValue, radValue);
		}
		
		for(int i=0; i<c.length; i++) {
			c[i].show();
		}
		
	}

	private static void rec() {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		r.show();
		System.out.println("s의 면적은 " + s.square());
		if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
		if(t.contains(s)) System.out.println("t는 s을 포함합니다.");
	}

	private static void song() {
		Song abba = new Song(1978, "스웨덴", "ABBA", "Dancing Queen");
		abba.show();
	}

	private static void grade(Scanner sc) {
		System.out.println("수학, 과학, 영어 순으로 3개의 점수 입력 >> ");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int eng = sc.nextInt();
		
		Grade me = new Grade(math, science, eng);
		System.out.println("평균은 " + me.avg());
		
	}

	private static void tv() {
		Tv myTv = new Tv("LG", 2017, 32);
		myTv.show();
	}

}
