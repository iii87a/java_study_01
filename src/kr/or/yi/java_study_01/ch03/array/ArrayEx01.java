package kr.or.yi.java_study_01.ch03.array;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//array01();  
	    //array02();
		//array03();
		array04(sc);
		sc.close();
		
	}



	private static void array04(Scanner sc) {
		int intArray[] = new int[5]; // 길이 5인 intArray 배열 생성
		
		int max = Integer.MIN_VALUE; //현재 가장 큰 수 
		int min = Integer.MAX_VALUE; //현재 가장 작은 수
		System.out.printf("정수형(int) 범위 %d ~ %d %n", Integer.MIN_VALUE, Integer.MAX_VALUE);

		
		System.out.println("양수 5개를 입력하세요.");
		for(int i=0; i<intArray.length; i++) {
			intArray[i] = sc.nextInt();
			if(intArray[i] > max) {
				max = intArray[i];
			}
			if(intArray[i] < min) {
				min = intArray[i];
			}
		
		}
		System.out.println("가장 큰 수는 " + max + " 입니다.");
		System.out.println("가장 작은 수는 " + min + " 입니다.");
		
		System.out.println("찾고자하는 정수 값을 입력하세요. >> ");
		int searchKey = sc.nextInt();
		//intArray에 입력한 searchKey가 존재하면 "위치하고 있는 인덱스" 출력하고 찾지못하면 -1 출력
		int findIndex = -1;
		int i;
		for(i=0; i<intArray.length; i++) {
			if(searchKey == intArray[i]) {
				findIndex = i; //searchKey 가 intArray 안에 없으면 if 문장 수행하지 않고 바로 -1을 출력하기 위해서 디폴트 값 -1 지정
				 break;
			}
			
		}
		 System.out.printf("searchKey %d는 %d 위치에 있습니다.", searchKey, findIndex);
	}

	private static void array03() {
		char[] chArr = new char[26];
		char ch = 'a';
		
		for(int i=0; i<chArr.length; i++) {
			//System.out.printf("%c ", chArr[i]);
			chArr[i] = ch++;
		}
		System.out.println();
		for(int i=0; i<chArr.length; i++) {
			System.out.printf("%c ", chArr[i]);//%d -> "%d ", (int)chArr[i];
		}
	}

	private static void array02() {
		//선언과 동시에 초기화
		int[] intArray = {5, 4, 3, 2, 1};
		
		for(int i=0; i<intArray.length; i++) {
			System.out.printf("%d ", intArray[i]);
		}
		intArray[2] = 10; //intArray 초기화 한 후에 중간에 intArray 배열에 값을 변경하고, myArray와 레퍼런스 치환하면 myArray의 인덱스2번 값만 10으로 변경됨.
		System.out.println();
		int[] myArray = intArray; //레퍼런스 치환
		
		for(int i=0; i<myArray.length; i++) {
			System.out.printf("%d ", myArray[i]);
		}
	}

	private static void array01() {
		int[] intArray01 = null; // 정수형 inArray01 배열 선언
		System.out.println(intArray01); //선언만 하고 출력 -> 로컬변수 에러 -> 정수형 배열인 동시에 지역변수 (= 지역변수는 초기화 해야함)
		intArray01 = new int[5];
		System.out.println(intArray01); //[I@15db9742 -> 주소값
		System.out.println(intArray01[0]);
		System.out.println(intArray01[1]);
		System.out.println(intArray01[2]);
		System.out.println(intArray01[3]);
		System.out.println(intArray01[4]);
		
		System.out.println("배열의 크기 = " + intArray01.length); //배열의 크기 구하는 법
		
		for(int i=0; i<intArray01.length; i++) {
			System.out.printf("%d ", intArray01[i]);//0으로 초기화된 인덱스 0 ,1,2,3,4 가 출력
		}
	}

}
