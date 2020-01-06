package kr.or.yi.java_study_01.ch03.array;

public class ArrayEx03 {

	public static void main(String[] args) {
		int[] intArr = {5,4,3,2,1};
		prnArray(intArr);
		sort(intArr); //정렬 수행 (중첩loop) -> 인덱스0이 1보다 크면 위치 변경
		prnArray(intArr);//1,2,3,4,5

	}

	private static void sort(int[] arr) {
		int temp;
		
		for(int n=0; n<arr.length-1; n++) {
			for(int i=0; i<arr.length; i++) {
			}
				for(int p=0; p<arr.length-1; p++) {
					if(arr[p]>arr[p+1]) {
						temp = arr[p];
						arr[p] = arr[p+1];
						arr[p+1] = temp;
					}
				}

		}	
	}

	private static void prnArray(int[] arr) {
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
	}

}
