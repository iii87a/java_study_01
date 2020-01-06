package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class RockScissorsPaper2 {

	public static void main(String[] args) {
		// 가위바위보 게임을 만든다. 
		// 두사람의 이름은 철수와 영희고, 
		// 철수 >> 를 먼저 출력하라.
		// 가위, 바위, 보, 중 하나를 문자열로 입력받고, 
		// 영희 >> 를 출력하라. 
		// 마찬가지로 입력 받으시오.
		// 그런다음 누가 이겼는지 판별하여 승자를 출력 하시오. 
		Scanner sc = new Scanner(System.in);
		rspGame(sc);
		
		sc.close();
		

	}

	private static void rspGame(Scanner sc) {
		System.out.print("철수 >>");
		String answerCS = sc.next();
		System.out.print("영희 >>");
		String answerYH = sc.next();

		
		
		if(answerCS.equals("가위")) { //철수 가위 영희 보
			if(answerYH.equals("보")) {
				System.out.println("철수가 이겼어요");
			}
			else if(answerYH.equals("바위")) { //철수 가위 영희 바위
				System.out.println("영희가 이겼어요");
			}
			else { //철수 가위 영희 가위
				System.out.println("비겼어요.");
			}
		}
		
		if(answerCS.equals("바위")) {//철수 바위 영희 가위
			if(answerYH.equals("가위")) {
				System.out.println("철수가 이겼어요");
			}
			else if(answerYH.equals("바위")) {
				System.out.println("비겼어요");
			}
			else {
				System.out.println("영희가 이겼어요");
			}
		}
		if(answerCS.equals("보")) {//철수 바위 영희 가위
			if(answerYH.equals("가위")) {
				System.out.println("영희가 이겼어요");
			}
			else if(answerYH.equals("바위")) {
				System.out.println("철수가 이겼어요");
			}
			else {
				System.out.println("비겼어요");
			}
		}
		
		
		
	}

}

