package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;

public class MethodCall {

	public static void main(String[] args) {
		/*
		 * void_method(5); int res = return_method(3,5); System.out.println(res);
		 * 
		 * makeIntArray(5);
		 */
		
		int a = 5;
		int b = 3;
		System.out.printf("변경 전 a = %d, b = %d %n", a, b);
		swap(a,b);
		System.out.printf("변경 후 a = %d, b = %d %n", a, b);
		
		int[] arr = {5,3};
		System.out.printf("변경 전 arr[0] = %d, arr[1] = %d %n", arr[0], arr[1]);
		swap(arr);
		System.out.printf("변경 후 arr[0] = %d, arr[1] = %d %n", arr[0], arr[1]);
	}
	
	private static void swap(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		System.out.printf("swap arr[0] = %d, arr[1] = %d %n", arr[0], arr[1]);
	}

	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.printf("swap a = %d, b = %d %n", a, b);
	}

	private static void makeIntArray(int size) {
		int[] temp = new int[size];
		System.out.println(Arrays.toString(temp));
		
	}

	public static int return_method(int a, int b) {
		int c = a + b;
		return c;
	
	}
	
	public static void void_method(int size) { //함수 시그니처
		System.out.println("size = " + size);
		return;
	}

}
