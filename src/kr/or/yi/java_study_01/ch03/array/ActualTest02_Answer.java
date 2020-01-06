package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ActualTest02_Answer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//exam04(sc);
		//exam05(sc);
		//exam06(sc);
		//exam07(sc);
		//exam08(sc);
		//exam09();
		  //exam10(sc);
		
		//exam11(sc);
		 exam12(sc);
		
		sc.close();
	}

	private static void exam12(Scanner sc) {
		String com[] = {"가위", "바위", "보"};
		System.out.println("컴퓨터와 가위바위 보 게임을 합니다.");
		String  res;
		int comResIdx;
		
		do {
			System.out.print("가위 바위 보 >> ");
			res = sc.nextLine();
			if(res.equals("그만")) {
				break;
			}
			comResIdx = (int)(Math.random()*3);
			System.out.printf("사용자 : %s 컴퓨터는 %s%n", res, com[comResIdx]);
			resultWinOrLose(res, com[comResIdx]);
		}while(true);
			
		
	}

	private static void resultWinOrLose(String user, String com) {
		if(user.equals("가위")) {
			if(com.equals("가위")) {
				
			}
		}else if(user.equals("바위")) {
			
		}else {
			//보를 입력
		}
		
	}

	private static void exam11(Scanner sc) {
		do {
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
		}while(true);
		sc.close();
		
	}

	private static void exam10(Scanner sc) {
		String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int[] score = {95, 88, 76 ,62 ,55 };
		
		String subj;
		int findIdx;
		while(true) {
			subj = sc.next();
			if(subj.equals("그만")) {
				break;
			}
			findIdx = find(subj, course);
			if(findIdx == -1) {
				System.out.print("없는 과목");
				continue;
			}
			System.out.printf("%s 과목의 점수는 %d%n ", subj, score[findIdx]);
			
		}
		
	}

	private static int find(String subj, String[] course) {
		for(int i=0; i<course.length; i++) {
			if(subj.equals(course[i])) {
				return i;
			}
		}
		return 0;
	}

	private static void exam09() {
		int[][] intArray = new int[4][4];
		for(int row = 0; row<intArray.length; row++) {
			for(int col = 0; col<intArray[row].length; col++) {
				intArray[row][col] = (int)(Math.random() * 10) +1;
			}
		}
		for(int[] rows : intArray) {
			for(int e : rows) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
		
	}

	private static void exam08(Scanner sc) {
		System.out.println("정수 몇 개?");
		int n = sc.nextInt();
		
		if(n <= 0 || n> 100) {
			System.out.println("1~100사이로 입력");
			sc.close();
			return; //return -> 'main 에서는' 프로그램 종료 
		}
		
		int [] intArray  = new int[n];
		int r;
		for(int i=0; i<intArray.length; i++) {
			r = (int)((Math.random()*100) + 1);
			if(isDuplicate(r, intArray, i)) {
				i--;
				continue;
			}
			/*
			 * for(int j=i-1; j>-1; j--) { if(intArray[j] == r) { i--; continue; } }
			 */
			intArray[i] = r;
			
		}
		Arrays.sort(intArray);
		for(int e : intArray) {
			System.out.print(e + " ");
		}
		
	}

	private static boolean isDuplicate(int key, int[] intArray, int i) {
			if(i<0) return false;
			for(int start =i; start>-1; start--) {
				if(intArray[start] == key) {
					return true;
				}
			}
		return false;
	}

	private static void exam07(Scanner sc) {
		int[] intArray = new int[10];
		System.out.println(Arrays.toString(intArray));
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = (int)(Math.random()*10 + 1);
			
		}
		System.out.println(Arrays.toString(intArray));
		double sum = 0; 
		for(int e : intArray) {
			System.out.print(e + " ");
			sum += e;
		}
		System.out.printf("평균은 %.1f%n", sum/intArray.length);
		//평균 합 합/10
		
		
		
	}

	private static void exam06(Scanner sc) {
		System.out.println("돈의 액수를 입력하세요.");
		int amount = sc.nextInt();
		
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		for(int i=0; i<unit.length; i++) {
			int res = amount/unit[i];
			if(res > 0) {
				System.out.println(unit[i] + ": " + res + "개" );
				amount = amount%unit[i];
			}
			
		
		
	}
		
	}

	private static void exam05(Scanner sc) {
		int[] intArray = new int[10];
		System.out.println("양의 정수 10개를 입력하세요.");
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = sc.nextInt();
		}
		System.out.print("/n3의 배수는 ");
		for(int i=0; i<intArray.length; i++) {
			if(intArray[i]%3 == 0) {
				System.out.println(intArray[i] + " ");
			}
		}
	}

	private static void exam04(Scanner sc) {
		//4번.
		System.out.println("소문자 알파벳을 하나 입력하시오.");
		String s = sc.next();
		
		if(s.length() != 1) {
			System.out.println("알파벳 하나만 입력하세요.");
			sc.close(); //그냥 return 하면 스캐너가  close 되지 않음 
			return;
		}
		char ch = s.charAt(0);
		if(ch < 'a' || ch > 'z') {
			System.out.println("알파벳 소문자만 입력하세요.");
			sc.close(); 
			return;
		}
		
		for(char i = ch; i>= 'a'; i--) {
			for(char j = 'a'; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
