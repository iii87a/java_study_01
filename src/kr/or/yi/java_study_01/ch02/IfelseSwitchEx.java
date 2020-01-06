package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class IfelseSwitchEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		gradeSwitch(sc);
		wannaCoffee(sc);
		coffeePrice(sc);
		sc.close();

	}

	private static void wannaCoffee(Scanner sc) {
		System.out.println("커피 드실래요?");
		String answer = sc.next();
		
		
		 switch(answer) { 
		 	case "네": 
		 		coffeePrice(sc); 
		 	case "아니오": 
		 		break; 
		 	}
		 
		
		/*
		 * if (answer.equals("네")) { coffeePrice(sc); }
		 */
	}

	private static void coffeePrice(Scanner sc) {
		// TODO Auto-generated method stub
		System.out.println("무슨 커피 드릴까요?");
		String order = sc.next();
		int price = 0;
		
		switch(order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500; break;
		case "아메리카노":
			price = 2000; break;
		default: System.out.println("메뉴에 없습니다!");
		}
		
		if(price != 0) System.out.println(order + "는" + price + "원입니다.");
		sc.close();
	}

	private static void gradeSwitch(Scanner sc) {
		char grade;
		System.out.println("점수를 입력하세요(0~100): ");
		int score = sc.nextInt();
		
		switch (score/10) {
			case 10:
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break; 
			default:
				grade = 'F';
		}
		System.out.println("학점은" + grade + "입니다.");
		
	}

}
