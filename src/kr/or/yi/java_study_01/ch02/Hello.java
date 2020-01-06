package kr.or.yi.java_study_01.ch02;

/**
 * 소스 파일 : Hello.java
 * 작성일: 2019.11.20
 * 아래 클래스에 대한 설명을 적음
 * 주석 단축키 : alt + shift + j 
 *
 */
public class Hello {
	public static void main(String[] args) {
		double PI = 3.141592;
		// 지역변수(함수 내 선언된 변수) 
		//args 도 지역변수 (지역변수는 영역 안에서만 유효함. 중괄호)
		// = : 할당(배정)연산자   a = b ( a: lvalue 저장소 = b: rvalue 값) rvalue 부터 수행함 (수행순서)
		int i = 20; // 선언과 초기화
		int s;  // 선언
		char a; // 선언 (문자형  변수)
		
		s = sum(i, 10); // s= 30
		a = '?';
		
		System.out.println(a + "Hello" + s);
		System.out.printf("%c %10s %d%5.2f%n", a ,"Hello", s, 5/3.0); // c-> character s -> 문자열  d-> 정수  %n : 줄바꿈   %f : 실수로 변경
		// %5.2f (전체자릿수 5, 소수점 자리2)
		// 10s -> s 앞에 10 자리 공간
		// -10s -> 좌측정렬
		// 연산 순서
		// 'a' + "Hello" + 30
		// "a" + "Hello" + 30
		// "aHello" + 30
		// "aHello" + "30"
		System.out.println(a + "Hello" + s + 10);
		
		System.out.println(a + "Hello" + (s + 10));
		/* System.out.println("n = %d, m = %d%n" , n, m); */
		System.out.println("\"java's 어렵다\"");
		
		PI = 3.14;
	
	}

	private static int sum(int n, int m) {
		// TODO Auto-generated method stub
		return n + m;
	}

	
}
