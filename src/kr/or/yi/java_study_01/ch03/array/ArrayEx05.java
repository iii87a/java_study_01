package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;

public class ArrayEx05 {

	public static void main(String[] args) {
		ArrayTest();

	}

	private static int ArrayTest() {
		int[] intArray = new int[30];
		
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = i;
		}
		int searchKey = 20;
		int left = 0;
		int right = intArray.length-1;
		int mid;
		
		System.out.print(Arrays.toString(intArray));
		
		while(left<=right) {
			mid  = (left+right)/2;
			if(intArray[mid] > searchKey) {
				right = mid - 1;
			}
			else if(intArray[mid] < searchKey) {
				left = mid + 1; 
			}
			else if(intArray[mid] == searchKey) {
				return mid;
			}
		}
		return -1;
		
	}

}
