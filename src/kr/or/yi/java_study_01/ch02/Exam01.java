package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;
//scanner 스캐너 자동 import : ctrl + shift + o 

public class Exam01 {

	private static int res;

	public static void main(String[] args) {
		System.out.println("두 정수를 입력하세요. 공백으로 분리>>");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		res = sum(a,b);
		System.out.printf("두 수 (%d, %d) 의 합은 %d%n", a, b, res);
		
		res = sub(a, b); //두 수의 차
		System.out.printf("두 수 (%d, %d) 의 차는 %d%n", a, b, res);
		
		res = mul(a, b); //두 수의 곱
		System.out.printf("두 수 (%d, %d) 의 곱은 %d%n", a, b, res);
		
		res = (int) div(a, b); //두 수의 나누기
		System.out.printf("두 수 (%d, %d) 의 몫은 %.1f%n", a, b, div(a, b));
		
		sc.close();
	}

	private static double div(int a, int b) {
		// TODO Auto-generated method stub
		return (double) a / b;
	}

	private static int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	private static int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	private static int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}
