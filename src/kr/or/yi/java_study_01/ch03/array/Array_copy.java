package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;

public class Array_copy {

	public static void main(String[] args) {
		int [] arr01 = {1,2,3,4,5};
		int [] arr02 = new int[5]; 
		System.out.println(Arrays.toString(arr02));
		System.arraycopy(arr01, 0, arr02, 0, arr01.length-1);
		System.out.println(Arrays.toString(arr01));
		
		System.out.println(arr01);
		
		for(int i=0; i<arr01.length; i++) {
			System.out.print(arr01[i] + " ");
		}
	}

}
