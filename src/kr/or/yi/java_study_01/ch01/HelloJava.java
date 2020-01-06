package kr.or.yi.java_study_01.ch01;

// class Test{ }
// 찾기 쉽게 하나의 파일 안에는 하나의 클래스만 생성하기

// 파일 명과 동일한 (소유 클래스만) 앞에 public 을 쓸 수 있다
public class HelloJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		System.out.print("Hello Java");
//		System.out.print("힘들어요");

		// System.out.println 있으면 줄 바꿈돼서 프린트
		// 없으면 줄바꿈 x

		// 함수(괄호 안) 내에서 선언된 변수는 지역변수
		// 자바는 클래스변수가 있고 전역변수가 없다

		String name = "황하나"; // 변수 지정 ( ctrl + /) 해제 (ctrl + /)
		System.out.print("Hello Java");
		/*
		 * 문자열 + 변수 => 문자열 + 문자열 => 블럭 주석 (ctrl + shift + /) 해제 (ctrl + shift + \ ) 하나의
		 * 문자열로 결합 (문자열 결함연산자(+))
		 */
		System.out.print("힘들어요" + name);
	}

}
