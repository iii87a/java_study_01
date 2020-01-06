package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class exam02 {

	// main 수행이 끝나면 클래스가 끝난다 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		getHourMinuteSecond(sc);
		 getPayCount(sc); 
		sc.close();
		
		 prefix();
		 postfix();
		 return;

	}
	
	
	// 함수들 (정의만/ 호출은 위에 main void 에서)
	private static void prefix() {
		int a = 10; 
		 int b = ++a; // 전위 증감
		 System.out.printf("a = %d b = %d %n", a, b);
		 return;
	}

	private static void postfix() {
		int a = 10; 
		 int b = a++; // 후위 증감
		 System.out.printf("a = %d b = %d %n", a, b);
		 return;
	}

	private static void getPayCount(Scanner sc) {
		System.out.print("금액을 입력하세요.");
		int pay = sc.nextInt();
		int 십원 = (((((((pay % 50000)%10000)%5000)%1000)%500)%100)%50)/10;
		int 오십원 = ((((((pay % 50000)%10000)%5000)%1000)%500)%100)/50;
		int 백원 = (((((pay % 50000)%10000)%5000)%1000)%500)/100;
		int 오백원 = ((((pay % 50000)%10000)%5000)%1000)/500;
		int 천원 = (((pay % 50000)%10000)%5000)/1000;
		int 오천원 = ((pay % 50000)%10000)/5000; // 7870/5000 = 2870
		int 만원 = (pay % 50000)/10000; //97870 & 50000 =  47870 ->  (47870)/10000
		int 오만원 = pay / 50000;

		System.out.printf("%d십원 %d오십원 %d백원 %d오백원 %d천원 %d오천원  %d만원 %d오만원 입니다.%n", 십원, 오십원, 백원, 오백원, 천원, 오천원, 만원, 오만원);
	}

	 private static void getHourMinuteSecond(Scanner sc) {
	  System.out.print("정수를 입력하세요."); int time = sc.nextInt(); int second = time %
	  60; int minute = (time/60) % 60; int hour = (time/60) / 60;
	  
	  System.out.printf("%d초는 %d시간 %d분 %d초입니다.%n", time, hour,minute, second);
	 
	  
	  
	  }
	
}
