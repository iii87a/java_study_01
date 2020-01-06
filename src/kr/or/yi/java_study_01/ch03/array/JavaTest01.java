package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class JavaTest01 {

	public static void main(String[] args) {
		work();

	}

	private static int findSbj(String[] course, String findSbj) {
		for (int i = 0; i < course.length; i++) {

			if (course[i].equals(findSbj)) {
				return i;
			}
		}
		return -1;
	}

	private static void work() {
		Scanner sc = new Scanner(System.in);
		String[] course = { "Java", "C++", "HTML5", "컴퓨터구조", "안드로이드" };
		int[] score = { 95, 88, 76, 62, 55 };

		System.out.print("과목 이름?");
		String findCs = sc.next();
		
		int findidx = findSbj(course, findCs);
		
		if(findidx == -1) {
			System.out.println("없다");
			return;
		}
		System.out.println(score[findidx]);
		/*int i;
		 * for (i = 0; i < course.length; i++) {
		 * 
		 * if (course[i].equals(findCs)) { System.out.println(score[i]); break; }
		 * 
		 * else if (findCs.equals("그만")) { System.out.print("종료합니다"); break; } } if (i
		 * == course.length) { System.out.print("없는 과목 입니다."); }
		 */
		sc.close();
	}

}
