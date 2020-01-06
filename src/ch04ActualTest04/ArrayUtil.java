package ch04ActualTest04;

import java.util.Arrays;

public class ArrayUtil {

	public static int[] concat(int[] a, int[] b) {
		int leng = a.length+b.length;
		int[] c = new int[leng];
		
		//array.copy(복사할 배열 , 인덱스넘버, 복사될 배열, 인덱스 넘버, 범위)
		//array.copy(a, 0, c, 0, a.length)
		//a배열의 0번째부터 c의 0번째부터 a의 길이만큼 복사하기 
		for(int i=0; i<a.length; i++) {
			c[i] = a[i];
		}
		//array.copy(b, 0, c, a.length, b.length
		//b배열의 0번째부터 c의 a.length번째부터 b의 길이만큼 복사하기
		for(int i=0; i<b.length; i++) {
			c[i+a.length] = b[i];
		}
		
		return c;
	}

	public static void print(int[] c) {
 
			System.out.print(Arrays.toString(c));
	
	}
	
	
	
}
