package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ActualTest02 {

	public static void main(String[] args) {
			// ======실 습 문 제 ======//
//1. (1) 0~99까지 짝수의 합
//   (2) main 메소드로 만들고 whileTest로 완성
		
		//work1();
//	 (3) for문으로 동일하게 완성
		//work1_forTest();
//	 (4) do-while 문으로 동일하게 완성
		//work1_doWhile();

//2. 다음 2차원 배열 n을 출력하는 프로그램
		//makeArray();
//3. 스캐너를 이용해서 정수를 입력받고 다음과 같이 *을 출력하시오. (5를 입력받)
		Scanner sc = new Scanner(System.in);
		//star(sc);
		
//4. 스캐너를 이용하여 소문자 알파벳을 하나 입력받고 알파벳을 출력하는 프로그램 작성
		//alpha(sc);
		
//5. 양의 정수를 10개 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력
		//work5(sc);

//6. 키보드에서 정수로 된 돈의 액수를 입력받아 오만원, 만원, 천원, 5백원 백원 50, 10,1원 동전 변환
// (반드시 배열 이용)
		 //work6(sc);
	
//7. 정수 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장.
		// 배열에 든 숫자들과 평균을 출력
		//work7();
		
//8. 정수를 몇 개 저장할 지 키보드로부터 개수를 입력받아 (100보다 작은 수) 정수배열을 생성하고,
	//이곳에 1에서 100까지 범위의 정수를 랜덤하게 삽입하라.
	//배열에는 같은 수가 없 도록 하고 배열을 출력하시오.
		work8(sc);

//9. 4x4 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 랜덤하게 생성
	//정수 16개를 배열에 저장하고, 2차원 배열을 화면에 출력
		
		//work9(); 
//10. 4x4 2차원 배열을 만들고 이곳에 1에서 10까지 범위의 정수를 10개만 랜덤하게 작성하여
		//임의의 위치에 삽입하라. 동일한 정수가 있어도 상관없음.
		//나머지 6개의 숫자는 모두 0이다. 
		//  work10();
			//work10_1();

//13. 반복문을 이용하여 369 게임에서 박수를 쳐야하는 경우를 순서대로 출력
//1부터 시작하며 99까지만 함
			//work13();

//14. 과목과 점수가 짝을 이루도록 2개의 배열 작성
		//work14(sc);
		
//15. 2개의 정수를 입력받아 곱을 구하는 클래스 
	//	work15(sc);
		//work15_1(sc);
		//example(sc);
		
//16.가위 바위보
		//work16(sc);
		
		sc.close();
	}
	private static void work16(Scanner sc) {
		String[] gameArray = {"가위", "바위", "보"};
		//for(int i=0; i<gameArray.length; i++) {
		//	System.out.print(gameArray[i]);
		//}
		
		while(true) {
			System.out.println("가위,바위,보 중 하나를 입력하세요.");
			String user = sc.next();
			int n = (int)(Math.random()*3);
			String com = gameArray[n];
			
			if(user.equals("그만")) {
				System.out.print("종료합니다.");
				break; 
			}
			else if(com.equals("가위")) {//컴 = 가위
				if(user.equals("바위")) {//사용자 = 바위
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + com + ", 사용자가 이겼습니다.");
				}
				else if(user.equals("보")) {//사용자 = 보
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + com + ", 컴퓨터가 이겼습니다.");
				}
				else {
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + com + ", 비겼습니다.");
				}
				
			}
			else if(com.equals("바위")) {//컴 = 바위
				if(user.equals("바위")) {//사용자 = 바위
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + com + ", 비겼습니다.");
				}
				else if(user.equals("보")) {//사용자 = 보
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + com + ", 사용자가 이겼습니다.");
				}
				else {//사용자 = 가위
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + com + ", 컴퓨터가 이겼습니다.");
				}
			}
			else if(com.equals("보")) { //컴 = 보
				if(user.equals("바위")) {//사용자 = 바위
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + com + ", 컴퓨터가 이겼습니다.");
				}
				else if(user.equals("보")) {//사용자 = 보
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + com + ", 비겼습니다.");
				}
				else {//사용자 = 가위
					System.out.println("사용자 = " + user + ", 컴퓨터 = " + com + ", 사용자가 이겼습니다.");
				}
			}
		
		}
		
	}

	private static void example(Scanner sc) {
		
		  int a,b;
	        a = sc.nextInt();
	        b = sc.nextInt();
	        System.out.println(a+" "+b);
		
	}

	private static void work15_1(Scanner sc) {
		
		while(true) {
			System.out.print("곱하고자 하는 두 수 입력 >> ");
			try {
				
				int n = sc.nextInt();
				int m = sc.nextInt();
				
				System.out.print(n + "x" + m + "=" + n*m);
				break;
			}catch(InputMismatchException e){
				System.out.print("실수를 입력하면 안됩니다.");
				sc.nextLine();
			//	continue; 
			}
		}
	}

	private static void work15(Scanner sc) {
		int n;
		int m;
	
	while(true) {
		System.out.print("곱하고자 하는 두 수 입력 >> ");

		try {
			
			n = sc.nextInt();
			m = sc.nextInt();
		
			System.out.print(n + "x" + m + "=" + n*m);
			break;
		}catch(InputMismatchException e) {
			System.out.print("실수는 입력하면 안됩니다.");
			 sc.nextLine();
			continue;
					
				
		}
	}
}
	

	private static void work14(Scanner sc) {
		String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int[] score = {95, 88, 76 ,62 ,55 };
		
		System.out.print("과목 이름?");
		String findCs = sc.next();
		int i;
		
		for(i=0; i<course.length; i++) {
			
				if(course[i].equals(findCs)) {
					System.out.println(score[i]);
					break;
				}
				
				else if(findCs.equals("그만")) {
					System.out.print("종료합니다");
					break;
				}
			}
		if(i == course.length) {
			System.out.print("없는 과목 입니다.");
		}
			
		
		
	}

	private static void work13() {
	
	for(int i = 1; i<100; i++) {
		if(i == 3 || i == 6 || i == 9) {
			System.out.println( i + " 박수짝");
		}
		else if(i/10 == 3 || i/10 == 6 || i/10 == 9) {
			if(i%10 == 3 || i%10 == 6 || i%10 == 9) {
				System.out.println(i + " 박수짝짝");
			}
			else {
				System.out.println(i + " 박수짝");
			}
		}
		else if(i%10 == 3 || i%10 == 6 || i%10 == 9) {
			System.out.println(i + " 박수짝");
		}
	}
		
	}

	private static void work10_1() {
		int[][] intArray = new int[4][4];
		
		Random rnd = new Random();
		int row;
		int col;
		int count = 0; //갯수 
		for(int i=0; count<10; i++) {
			row = rnd.nextInt(4);
			col = rnd.nextInt(4);
			if(intArray[row][col] != 0) {//값이 0이 아님 == 이미 해당 위치에 값이 할당
				continue; //다시 돌아가서 위치 값 할당
			}
			else {
				intArray[row][col] = rnd.nextInt(10)+1;
				count++;
			}
				//System.out.println(rnd.nextInt(16));//0~15까지
				//System.out.println(rnd.nextInt(10)+1); //1~10까지 
		}
		
		//int rnd = (int)(Math.random()*10+1); 1~10까지
		System.out.println("count = " + count);
		prnArray(intArray);
		
	}

	private static void prnArray(int[][] intArray) {

		for(int[]arr : intArray) {
			System.out.println(Arrays.toString(arr));
		}
		
	}

	private static void work10() {
		int[][] intArray = new int[4][4];
		int cnt=0;
		for(int index=0; index<intArray.length; index++) {
			for(int idx=0; idx<intArray[index].length; idx++) {
					int rnd = (int)(Math.random()*10+1);
				
					cnt++;
					int rndNum = (int)(Math.random()*4);
					int rndNum2 = (int)(Math.random()*4);
					intArray[rndNum][rndNum2] = rnd;
					System.out.print(intArray[rndNum][rndNum2] + " ");
					if(cnt >= 10) {
						
					   break;
					}
				
					
				/*
				 * if(cnt<11) { intArray[rndNum][rndNum2] = rnd;
				 * System.out.print(intArray[rndNum][rndNum2] + " "); } else if(cnt>10) {
				 * System.out.print("0 "); }
				 */
			}
			System.out.println();
		}
		
	}

	private static void work9() {
		int[][] intArray =  new int[4][4];

		for(int index=0; index<intArray.length; index++) {
			
				for(int idx=0; idx<intArray[index].length; idx++) {
					int i = (int)(Math.random()*10+1);
					intArray[index][idx] = i; 
					System.out.print(intArray[index][idx] + " ");
				}
				System.out.println();
		}
		System.out.println(Arrays.deepToString(intArray));
	}

	private static void work8(Scanner sc) {
		System.out.println("정수를 몇 개 저장할지 입력하세요.(100보다 작은 수 )");
		int value = sc.nextInt();
		
		int intArray [] = new int[value];
		
		for(int i=0; i<intArray.length; i++) {
			int rnd = (int)((Math.random()*10) + 1);
			for(int n=0; n<i; n++) {
				if(rnd != intArray[n]) {
					intArray[i] = rnd;
				}
				else {
					--i;
					break;
				}
			}
		//	intArray[i] = rnd;
			/*
			 * for(int n=0; n<i; n++) { if(intArray[i] == intArray[n]) { --i; break; } }
			 */
		}
		//System.out.println(Arrays.toString(intArray));
		for(int e : intArray) {
			System.out.print(e + " ");
		}
		
	}

	private static void work7() {
		int[] intArray = new int[10];
		int sum = 0;
//		System.out.println(Arrays.toString(intArray));
		
		  for(int index=0; index<intArray.length; index++) {
			  int i = (int)(Math.random()*10+1);
			  intArray[index] = i; 
			  sum+=intArray[index];
			  }
		  
		  System.out.println("배열은 " + Arrays.toString(intArray) + " 입니다.");
		  System.out.println("배열의 평균값은 " + sum/intArray.length + " 입니다.");
		 
		
	}

	private static void work6(Scanner sc) {
		System.out.println("돈의 액수를 입력하세요.");
		int amount = sc.nextInt();
		int value;
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		for(int i=0; i<unit.length; i++) {
			value = amount/unit[i];
			amount = amount%unit[i];
			System.out.println(unit[i] + ": " + value + "개" );
			
		}
		
	}

	private static void work5(Scanner sc) {
		System.out.println("양의 정수 10개를 입력하세요.");
		int[] bArray = new int[10];
		

		for(int i=0; i<bArray.length; i++) {
			bArray[i] = sc.nextInt();
			
		}
		for(int n=0; n<bArray.length; n++) {
			if(bArray[n]%3 == 0) {
				System.out.print(bArray[n] + " ");
			}
		}
		
		
	}

	private static void alpha(Scanner sc) {
		System.out.println("소문자 알파벳을 하나 입력하시오.");
		char alpha = sc.next().charAt(0);
		
		
		for(int n=5; n>0; n--) {
			//for(int i=1; i<n+1; i++) {
				for(int p=n-1; p>=0; p--) {
					System.out.print(Character.toString((char)(alpha - p)));
				}
			//}
		System.out.println();
		}
	}

	private static void star(Scanner sc) {
		System.out.println("정수를 입력하세요.");
		int star = sc.nextInt();
		
		for(int n=star; n>0; n--) {
			for(int i=1; i<n+1; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

	private static void makeArray() {
		int[][] nArray = new int[5][];
		nArray[0] = new int[1];
		nArray[1] = new int[3];
		nArray[2] = new int[1];
		nArray[3] = new int[4];
		nArray[4] = new int[2]; 
	
	for(int i=0; i<nArray.length; i++) {
		for(int s=0; s<nArray[i].length; s++) {	
				nArray[i][s] = s+1;
			
			
		}
	}
		
		System.out.println(Arrays.deepToString(nArray));
		
	}

	private static void work1_doWhile() {
		int sum = 0;
		int i = 0;
		do {
			sum += i;
			i += 2;
		}while(i<100);
		System.out.println(sum);
		
	}

	private static void work1_forTest() {
		int sum = 0;
		int i;
		for(i = 0; i<100;) {
			sum += i;
			i += 2;
		}
		System.out.println(sum);
		
	}

 	
	private static void work1() {
		int sum = 0, i = 0;
		while(i < 100) {
			sum = sum+ i;
			i += 2;
		}
		System.out.println(sum);
		
	}

}
