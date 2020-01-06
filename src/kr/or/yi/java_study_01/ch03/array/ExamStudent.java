package kr.or.yi.java_study_01.ch03.array;

import java.util.Random;

public class ExamStudent {

	public static void main(String[] args) {
		//배열 2개 (이름, 점수)
		
		//12명의 국어, 영어, 수학 점수를 담는 2차원 배열 선언
		//12명의 이름을 담은 배열 선언
		//60~100 사이의 랜덤한 값을 국,영,수 점수로 입력
		//이름 국어 영어 수학 총점 평균 출력
		//과목 별 평균 출력
		
		scoreAverage();

	}

	private static void scoreAverage() {
		Random rnd = new Random(1234567);
		String[] nameArr = {"권수진", "정아름", "황태원", "장현서", "현재승", "배진우", "박인선", "이상원", "유경진", "권태헌", "황하나", "이동주" };
		initName(rnd, nameArr);
		int[] scoreArr = new int[12];
		initArray(rnd, scoreArr);
		
	}

	private static void initName(Random rnd, String[] nameArr) {
		for(int i=0; i<nameArr.length; i++) {
			System.out.println(nameArr[i]);
		}
		
	}

	private static void initArray(Random rnd, int[] scoreArr) {
		int min = 60;
		int max = 100;
		System.out.print("국어   ");
		System.out.print("영어   ");
		System.out.print("수학   ");
		System.out.println();
		for(int i=0; i<scoreArr.length; i++) {
			scoreArr[i] = rnd.nextInt(max - min + 1) + min; // 0 <= nextInt(40) <= 40 -> 60 <= nextInt(40)+60 < 100
			System.out.println(scoreArr[i] + "   ");
		}
		

		
	}

}
