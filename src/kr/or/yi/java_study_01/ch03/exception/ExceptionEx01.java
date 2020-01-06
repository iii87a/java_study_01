package kr.or.yi.java_study_01.ch03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx01 {

	public static void main(String[] args) {
		//exam01();
		//ArithmeticException();
		Scanner sc = new Scanner(System.in);
		
		try {
			int[] intArr = new int[5];
			//int a = sc.nextInt();
			//intArr[5]=10;
			//System.out.println(5/0);
			int c = Integer.parseInt("a");
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생!");
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다. ");
		}catch (InputMismatchException e) {
			System.out.println("숫자만 가능");
		}catch (NumberFormatException e) {
			System.out.println("문자화 된 숫자만 가능");
		}
		
		catch (Exception e) {
			System.out.println("위의 예외를 제외한 나머지 예외");
			e.printStackTrace();
		}
		
	}

	private static void ArithmeticException() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("나뉨수를 입력하시오.");
			int divide = sc.nextInt();
			System.out.print("나눗수를 입력하시오.");
			int divisor = sc.nextInt();
			
			try {
				System.out.println(divide + " 를  " + divisor + " 로 나누면 몫은 " + divide/divisor + " 입니다.");
				break;
			}
			catch(ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다 ! 다시 입력하세요.");
			}
		}
		sc.close();
	}

	private static void exam01() {
		int dividend =5;
		int divisor =1; 
		
		
		try {
		System.out.println(dividend + " 를 " + divisor + " 로 나누면 몫은 " + dividend/divisor + " 입니다. ");
		System.out.println("계산 완료");
		}catch (ArithmeticException e) {
			System.out.printf("%d / %d 예외 발생 0으로 나눌 수 없음 %n", dividend, divisor);
		}
		System.out.println("main() 수행완료!");
	}

}
