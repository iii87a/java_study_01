package kr.or.yi.java_study_01.ch03.array;

public class ReturnArray {

	public static void main(String[] args) {
		int intArray[]; //배열 생성
		intArray = makeArray(); //메소드로부터 배열 전달받음
		for(int i=0; i<intArray.length; i++) {
			System.out.print(intArray[i] + " "); //배열의 모든 원소 출력
		}

	}

	private static int[] makeArray() {
		int temp[] = new int[4]; //정수형 배열 리턴 / 배열 temp 생성 (인덱스 4)
		for(int i=0; i<temp.length; i++) {
			temp[i] = i; //배열의 원소를 0,1,2,3으로 초기화
			
		}
		return temp; //배열 리턴
	}

}
