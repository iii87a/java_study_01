package kr.or.yi.java_study_01.ch03.array;

public class ArrayEx02 {

	public static void main(String[] args) {
		char[] chArr = new char[26];
		prnArray(chArr);
		makeArray(chArr);
		prnArray(chArr); // z y x...a
		//위치 교환

		char temp = chArr[0];
		chArr[0] = chArr[1];
		chArr[1] = temp;
		prnArray(chArr); // y z x...a
		

	}

	private static void prnArray(char[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%c ", arr[i]);
		}
		    System.out.println();
		
	}

	private static void makeArray(char[] arr) {
		char ch = 'z';
		for(int i=0; i<arr.length; i++) {
			arr[i] = ch--;
		}
		
	}

}
