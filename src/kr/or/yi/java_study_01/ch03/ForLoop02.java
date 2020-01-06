package kr.or.yi.java_study_01.ch03;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		//sum();
		//1~100까지의 짝수합과 홀수합, 전체합을 구하는 반복문을 작성
		//exam01();
		//별찍기01
		//star1();
		//별찍기02
		//star2();
		//
		//star3();
		//공백찍기
		//공백공백공백공백*
		//공백공백공백**
		//공백공백***
		//공백****
		//*****
		
		//space1(); 
		
		//공백찍기2
		//*****
		//공백****
		//공백공백***
		//공백공백공백**
		//공백공백공백공백*
		 

		//space2();
		
		
		
		 Scanner sc = new Scanner(System.in);
		 
	       
	      //fac1(sc);
		  //fac2(5);
		 
		    fibo(5);
	     
		 
		

	}
	
	
	

	private static void fibo(int fibo) {
		
		
		
		
	}




	private static void fac2(int cnt) {
		int res = 1;
		
		for(int i= cnt; i>0; i--) {
			res *= i;
			System.out.printf("%d %s ",i, i == 1?"=":"*" );
		}
		System.out.print(res);
		
	}




	private static void fac1(Scanner sc) {
		System.out.print("숫자를 입력하세요: ");
		int cnt = sc.nextInt();
		int res = 1;
 
 
		for (int i = 1; i < cnt+1; i++) {
		    res = res * i;
		    if(i<cnt) {
		    	System.out.printf("%d * ", i);
		    }
		    else {
		    	System.out.printf("%d = %d",i, res);
		    }
		    
		}
	}
	
	
	
	

	private static void space2() {
		for(int j=0; j<5; j++) {

		for(int p=0; p<j+1; p++) {

		System.out.print(" ");

		}

		for(int i=0; i<5-j; i++) {

		System.out.print("*");

		}

		System.out.println();

		}
	}

	private static void space1() {
		for(int j=0; j<5; j++) {

			for(int p=0; p<5-j; p++) {

			  System.out.print(" ");

			  }

			  for(int i=0; i<j+1; i++) {

			  System.out.print("*");

			  } 

			  System.out.println();

			}
	}

	private static void star3() {
		for(int j=0; j<5; j++) {
			  for(int i=0; i<5-j; i++) {
				  System.out.print("*");
			  } // j =0 이면 i가 5-0 = 5까지 반복, j = 1이면 i가 5-1 = 4 까지 반복....
			  System.out.println();
			}
	}

	private static void star2() {
		for(int j=0; j<5; j++) {
			  for(int i=0; i<j+1; i++) {
				  System.out.print("*");
			  } //j=0 일때는 i 가 1까지, 1일때는 i 가2까지 ... 
			  System.out.println();
			}
	}

	private static void star1() {
		for(int j=0; j<5; j++) {
		  for(int i=0; i<5; i++) {
			  System.out.print("*");
		  }
		  System.out.println();
		}
	}

	private static void exam01() {
		int evenSum = 0;
		int oddSum = 0;
		for(int i=0; i<101; i++) {
			if(i%2==0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		System.out.printf("홀수의 합 %d 짝수의 합 %d 전체 합 %d%n", oddSum, evenSum, evenSum + oddSum);
	}

	private static void sum() {
		int sum = 0;
		for(int i=0; i<11; i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
