package kr.or.yi.java_study_01.ch03.array;
 
import java.util.Random;
import java.util.Scanner;

public class JavaWork1206 {

	public static void main(String[] args) {
		//12/6 반복문 과제
		Scanner sc = new Scanner(System.in);
		//work1_1();
		//work1_2(sc);
		//work1_3(sc);
		//work2(sc);
		 work3(sc);
		  //work4_1();//별 7개씩 7줄 출력
			//work4_2();//별 1개부터 7개까지 순서대로 출력
		//	work4_3();//별 7개부터 1개까지 출력
		 
	}

	private static void work4_3() {
		
		for(int n=7; n>=0; n--) {
			for(int i=0; i<n; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private static void work4_2() {
		
		for(int n=0; n<7; n++) {
			for(int i=0; i<n+1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private static void work4_1() {
		//반복루프를 사용하여 별 패턴 출력
		
		for(int n=0; n<7; n++) {
			for(int i=0; i<7; i++) {
				System.out.print("*");	
			}
			System.out.println();
		}
	}

	private static void work3(Scanner sc) {
		
	
		int answer = 2; //정답 
		int userNum; //입력값 
		
		for(int i=0; answer == 2; i++) { 
			System.out.println("추측한 값을 입력하세요.");
			userNum = sc.nextInt(); //입력한 
			 
			 if(answer < userNum ) {
				 System.out.println("입력한 값이 정답보다 큽니다.");
				 continue;
			 }
			 else if(answer > userNum) {
				 System.out.println("정답이 입력한 값보다 큽니다.");
				 continue;
			 }
			 else if(userNum == answer) {
				 System.out.println("정답입니다!");
				 break;
			 }
		
		}
		
	}

	private static void work2(Scanner sc) {
		//사용자가 입력한 특정한 정수 자리를 반대로 바꾸어 출력하는 프로그램
		//ex. 1206을 입력하면 6021 출력
		//음수를 입력하면 오류 메세지
		
		System.out.println("숫자를 입력하세요.");
		int num = sc.nextInt();
		int leng = (int)(Math.log10(num)+1);
	//	System.out.println(leng); //길이 
		String str = Integer.toString(num);
		//System.out.print(str.charAt(3));
		
		if(num<0) {
			System.out.println("오류. 양수를 입력하세요.");
		}
		else {
			//for(int i=leng-1; i>=0; i--) {
			//	System.out.print(str.charAt(i));
		//	}
			//System.out.print(num);
			int i=leng-1;
			do {
				System.out.print(str.charAt(i));
				i--;
			}while(i>=0);
		
		}
	}

	private static void work1_3(Scanner sc) {
		//처리된 정수의 개수를 지정하지 않고, 사용자가 0 을 입력하면 반복을 중단하고
		//그때까지의 합을 출력한다.
		//입력된 정수가 0 이 아니면 합계에 더해진다. 
		// 예를 들어서 100 200 300 0 과 같이 입력될 수 있다.
		int sum = 0;
		int num = 0;
		//System.out.println("숫자를 입력하세요.");
		//num = sc.nextInt();
		
		for(int i=0; i<num+1; i++) {
			System.out.println("숫자를 입력하세요.");
			num = sc.nextInt();
			
			if(num == 0) {
				break;
			}
			else {
				sum += num;
			}
			
		}
		System.out.println(sum);
		
	}

	private static void work1_2(Scanner sc) {
		//맨 처음에 입력되는 정수가 앞으로 입력될 정수의 개수를 지정
		//ex. 3 100 200 300
		System.out.println("입력될 숫자 개수와 더할 숫자를 입력하세요.");
		int num = sc.nextInt();
		int sum = 0;
		int value = 0;
		
		
		System.out.println("입력될 숫자의 갯수는 " + num + " 개 입니다.");
		for(int i=0; i<num; i++) {
			value = sc.nextInt();
			sum += value; //sum = sum + 100;
			System.out.printf("%d %s", value, i==num-1?"=":"+");
			
		}
		System.out.println(sum);
		
		
		
		
	}

	private static void work1_1() {
		//사용자가 입력한 정수의 합을 구하여 출력하는 프로그램을 3가지 방법으로 작성
		
		//1~100까지의 정수들의 합
		int sum = 0;
		for(int i=0; i<101; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
	}

}
