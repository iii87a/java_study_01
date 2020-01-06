package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//work1();
		// exam3_2_while(sc);
		// exam3_2_for(sc);
		 exam3_2_for2(sc);
		   //fibo_while(10);
		sc.close();
	}

	private static void exam3_2_for2(Scanner sc) {
		int sum = 0;
		int count;
		System.out.print("정수를 입력하고 마지막에 -1을 입력하세요.");
		int n = sc.nextInt();
		for(count=0; n != -1; count++) {
			sum += n;
			n = sc.nextInt();
		}
		System.out.printf("정수의 개수는 %d 평균은 %.2f", count, (double)sum/count);
		
	}

	private static void fibo_while(int cnt) {
		int f1 = 0;
		int f2 = 1;
		int f3 = f1+f2;
		
		for(int i= 1; i<cnt; i++ ) {
			f3 = f1+f2;
			f1 = f2;
			f2 = f3;
		}
		System.out.print(f3);
		
		
	}

	private static void exam3_2_for(Scanner sc) {
		int count = 0;
		int sum = 0;
		
		System.out.print("정수를 입력하고 마지막에 -1을 입력하세요.");
		
		
		for(int n = sc.nextInt(); n != -1;) {
			sum += n;
			count++;
			n = sc.nextInt();
		}
		if(count == 0 ) {
			System.out.print("입력된 수가 없습니다.");
		}
		else {
			System.out.print("정수의 개수는 " + count + " 개이며, " );
			System.out.print("평균은 " + (double)sum/count + " 입니다.");
		}
		
	}

	private static void exam3_2_while(Scanner sc) {
		int count = 0;
		int sum = 0;
		
		System.out.print("정수를 입력하고 마지막에 -1을 입력하세요.");
		int n = sc.nextInt();
		
		while(n != -1) {
			sum += n;
			count++;
			n = sc.nextInt();
		}
		if(count == 0) {
			System.out.print("입력된 수가 없습니다.");
		}
		else {
			System.out.print("정수의 개수는 " + count + " 개이며, " );
			System.out.print("평균은 " + (double)sum/count + " 입니다.");
		}
		
	}

	private static void work1() {
		for(int i=0; i<10; i++) {
			System.out.print(i);
		}
	}

}
