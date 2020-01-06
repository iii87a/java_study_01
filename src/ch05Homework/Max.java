package ch05Homework;

import java.util.Arrays;

public class Max {
	public static int max(int[] arr) {
		
		if(arr == null || arr.length == 0) {
			return -99999;
		}
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					continue;
				}
				else {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr[0];
	}
	
	
	public static void main(String[] args) {
		int[] data = {3, 2, 9, 4, 7};
		System.out.println(Arrays.toString(data));
		System.out.println("최대값 : " + max(data));
		System.out.println("최대값 : " + max(null));
		System.out.println("최대값 : " + max(new int[] {}));//크기가 0인 배열

	}

}
