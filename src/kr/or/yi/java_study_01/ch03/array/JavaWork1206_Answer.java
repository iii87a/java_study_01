package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class JavaWork1206_Answer {

	public static void main(String[] args) {
		//1. 입력한 정수의 합을 구하여 출력하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		//exam1_a(sc);
		//exam01_b(sc);
		//exam01_c(sc);
		//exam02(sc);
		
			exam03(sc);
		
		sc.close();
	}

	private static void exam03(Scanner sc) {
		int correct = (int)(Math.random()*100) +1; //정답
		int count = 0; // 시도 횟수
		int res;
		do {
			System.out.print("1~100사이의 정수를 입력하세요. >> ");
			res = sc.nextInt();
			count++;
			if(res > correct) {
				System.out.println("낮음");
			}
			else if(res == correct) {
				System.out.println("정답");
				break;
			}
			else {
				System.out.println("높음");
			}
			
		}while(res > 0);
		
		System.out.println("높음");
	}

	private static void exam02(Scanner sc) {
		System.out.print("정수입력 >> ");
		int res = sc.nextInt(); //1206
		do {
			
			System.out.println(res%10);
			res = res/10;
		}while(res > 0);
	}

	private static void exam01_c(Scanner sc) {
		int iValue=0; 
		int sum = 0; 
		do {
			iValue = sc.nextInt();
			sum += iValue;
		}while(iValue != 0);
		System.out.printf("%d%n ", sum);
	}

	private static void exam01_b(Scanner sc) {
		//1-B. 두번째 방법
		System.out.print("입력값의 개수 입력값1 입력값2.. >> ");
		int cnt = sc.nextInt();
		int sum = 0; 
		int iValue;
		
		for(int i=0; i<cnt; i++) {
			iValue = sc.nextInt();
			sum += iValue;
			System.out.printf("%d %s ", iValue, i==cnt-1?"=":"+");
		}
		System.out.printf("%d%n ", sum);
	}

	private static void exam1_a(Scanner sc) {
		//1-A. 첫번째 방법
		System.out.print("시작 값 종료 값을 입력 >> ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		int sum = 0;
		
		for(int i=start; i<end+1; i++) {
			sum += i;
		}
		
		System.out.printf("%d 에서 %d 까지의 합은 %d%n" ,start, end, sum);
	}

}
