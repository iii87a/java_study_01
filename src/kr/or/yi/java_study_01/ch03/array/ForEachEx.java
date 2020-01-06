package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Random;

public class ForEachEx {

	public static void main(String[] args) {
		Random rnd = new Random(1234567);
		int[] intArr = new int[5];
		System.out.println(Arrays.toString(intArr));
		initArray(rnd, intArr);
		System.out.println(Arrays.toString(intArr));
		
		for(int i=0; i<intArr.length; i++) {
			System.out.printf("[%d] ", intArr[i]);
		}

		System.out.println();
		for(int e : intArr) { //for-each (intArr 배열의 인덱스 0부터 끝까지 하나씩 변수 e에 넣어줌
			System.out.printf("[%d] ", e);
		}
		System.out.println();
		
		String[] strArr = {"권수진", "정아름", "황태원", "장현서", "현재승", "배진우", "박인선", "이상원", "유경진", "권태헌", "황하나", "이동주" };
		for(String name:strArr) {
			System.out.println(name);//for-each
		}
		
		for(week w : week.values()) {
			System.out.println(w);
		}

	}

	private static void initArray(Random rnd, int[] intArr) {
		for(int i=0; i<intArr.length; i++) {
			intArr[i] = rnd.nextInt(50);//0~49까지 임의의 수
		}
		
	}

}
