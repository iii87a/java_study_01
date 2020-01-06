package kr.or.yi.java_study_01.ch03.array;

import java.util.Arrays;
import java.util.Random;

public class ArrayEx04 {

	public static void main(String[] args) {
		//generate_number();
		  
		  Random rnd = new Random(1234567);
		  int[] arr = new int[6];
		  System.out.println(Arrays.toString(arr));
		  
		  init_lotto(rnd, arr);
		  
		  //간단한 배열 출력
		  System.out.println(Arrays.toString(arr));
		  
		  bubble_sort(arr);
		  System.out.println(Arrays.toString(arr));
		  
		  
		  int searchKey = 17;
		  int findIdx = findSearch(arr, searchKey);
		  System.out.printf("%s 배열에서 %d 의 위치는 %d 입니다.", Arrays.toString(arr), searchKey, findIdx);
		  System.out.println();
		  
		  
		  findIdx = binarySearch(arr, searchKey);
		  System.out.printf("%s 배열에서 %d 의 위치는 %d 입니다", Arrays.toString(arr), searchKey, findIdx);
		  
	}
	

	private static int binarySearch(int[] arr, int searchKey) {
		int left = 0;
		int right = arr.length-1; //4
		int mid;
		
		while(left <= right) {
			mid = (left + right)/2;
			if(arr[mid] < searchKey) {
				left = mid + 1;
			}
			else if(arr[mid] > searchKey) {
				right = mid - 1;
				
			}
			else if(arr[mid] == searchKey) {
				return mid;
			}
			
		}

		return -1;
	}


	private static int findSearch(int[] arr, int searchKey) {
		//arr 배열에서 searchKey 가 존재하면 존재하는 위치(index)를 리턴, 만약 존재하지 않을 경우 -1을 리턴
		
		for(int i=0; i<arr.length; i++) {
			if(searchKey == arr[i]) {
				return i;
			}
		
		}
		return -1;
	}


	private static void bubble_sort(int[] arr) {
		int n;
		for(n=0; n<arr.length-1; n++) {
			for(int i=0; i<arr.length-(n+1); i++) {
					if(arr[i] > arr[i+1]) {
						int temp = arr[i];
						arr[i] = arr[i+1];
						arr[i+1] = temp;
					}
					System.out.println((n+1) + " innerfor " + Arrays.toString(arr));
			}
			System.out.println((n+1) + "회 => " + Arrays.toString(arr));
		}
		
		
		
		
	}


	private static void init_lotto(Random rnd, int[] arr) {
		for(int i=0; i<arr.length; i++) {
			  arr[i] = rnd.nextInt(46)+1;
		  }
	}

	private static void generate_number() {
		Random rnd = new Random();
		rnd.setSeed(1234);//랜덤값이 처음에 한번만 나오고 그 다음부터는 seed 값이 나오게 하기
		
		for(int i=0; i<6; i++) {
			System.out.print(rnd.nextInt(45) + 1 + " "); //rnd.next -> 0~1 사이의 실수 // rnd.nextInt(45) -> 45보다 작은 랜덤 값 
		}
	}

}
