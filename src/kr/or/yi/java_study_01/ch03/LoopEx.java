package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호를 입력하세요 1.for문 2.while 3.종료 >>");
		int res = sc.nextInt();
		while(res<3) {
			if (res==1) {
				System.out.println("for");
				ex_for(sc);
			}else {
				System.out.println("while");
				ex_while(sc);
			}
			System.out.print("번호를 입력하세요 1.for문 2.while 3.종료 >>");
			res = sc.nextInt();
		}
		System.out.println("프로그램 종료.");
		
		sc.close();
	}

	private static void ex_while(Scanner sc) {
		int res =1;
		System.out.print("번호를 입력하세요 1. gugudan 2. factorial 3.fibonacci 4.종료 >>");
		int i=0;
		while(res!=4) {
			res = sc.nextInt();
			System.out.println();
			switch(res) {
				case 1: gugudan_while(); break;
				case 2: factorial_while(); break;
				case 3: fibonacii_while(); break;
				default: System.out.println("while 문 종료");
				i++;
			}
			
			System.out.print("번호를 입력하세요 1. gugudan 2. factorial 3.fibonacci 4.종료 >>");
		}
		
		
		//while문과 switch문을 이용하여 1. gugudan 2. factorial 3.fibonacci 4.종료 구현
	}

	private static void fibonacii_while() {
		int f1 = 0;
		int f2 = 1;
		int f3 = f1 + f2;
		int i = 1;
		
		while(i<10) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			i++;
		}
		System.out.print(f3);
		System.out.println();
		
	}

	private static void factorial_while() {
		int answer = 1;
	    int i = 1;
	    while(i<6) {
	    	answer = answer * i;
	    	System.out.printf("%d %s ", i, i==5?"=":"*");
	    	i++;
	    }
	    System.out.print(answer);
	    System.out.println();
		
	}

	private static void gugudan_while() {
		int answer = 0;
		int i = 1;
		int n = 2;
	while(n<10) {
		while(i<10) {
			answer = n * i;
			System.out.print(n + " * " + i + " = " + answer + " ");
			i++;
		}
		System.out.println();
		i = 1;
		n++;
	  }	
	}

	private static void ex_for(Scanner sc) {
		int res=1;
		for(int i=0;res!=4;i++) {
			System.out.print("번호를 입력하세요 1. gugudan 2. factorial 3.fibonacci 4.종료 >>");
			res = sc.nextInt();
			switch(res) {
			case 1: gugudan_for(); break;
			case 2: factorial_for();break;
			case 3 :fibonacii_for();break;
			default :System.out.println("for 문 종료");
			
			}
			
		}
	
		//for문과 switch문을 이용하여 1. gugudan 2. factorial 3.fibonacci 4.종료 구현
	}

	private static void fibonacii_for() {
		System.out.println("fibonacii_for()");
		
		int f1 = 0;
		int f2 = 1;
		int f3 = f1 + f2;
		
		for(int i=1; i<10; i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		System.out.print(f3);
		System.out.println();
		
	}

	private static void factorial_for() {
		System.out.println("factorial_for()");
			int answer = 1;
		for(int i=1; i<6; i++) {
			answer = answer * i;
			System.out.printf("%d %s ", i, i==5?"=":"*");
		}
		System.out.print(answer);
		System.out.println();
		
	}

	private static void gugudan_for() {
		System.out.println("gugudan_for()");
		int answer = 0;
		
	for(int n = 2; n<10; n++) {
		for(int i = 1; i<10; i++) {
			answer = n * i;
			System.out.print(n + " * " + i + " = ");
			System.out.print(answer + "  ");
			
		}
		System.out.println();
	
	  }
	
    }



}
