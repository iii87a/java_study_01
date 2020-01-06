package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;

public class UnregularArray01 {

	public static void main(String[] args) {
		int intArray[][] = new int[4][];
		create_array(intArray); //배열 생성
		init_array(intArray); //배열 초기화
		prn_array(intArray); //배열 출력

	}

	private static void prn_array(int[][] intArray) {
		for(int i = 0; i<intArray.length; i++) {
			for(int j=0; j<intArray[i].length; j++) {
				System.out.print(intArray[i][j] + " ");
				System.out.println();
			}
		}
	}

	private static void init_array(int[][] intArray) {
		for(int i=0; i<intArray.length; i++) {
			for(int j=0; j<intArray[i].length; j++) {
				intArray[i][j] = (i+1) * 10 + j;
			}
		}
	}

	private static void create_array(int[][] intArray) {
		System.out.println(Arrays.deepToString(intArray));
		intArray[0] = new int[3];
		System.out.println(Arrays.deepToString(intArray));
		intArray[1] = new int[2];
		System.out.println(Arrays.deepToString(intArray));
		intArray[2] = new int[3];
		System.out.println(Arrays.deepToString(intArray));
		intArray[3] = new int[2];
		System.out.println(Arrays.deepToString(intArray));
	}

}
