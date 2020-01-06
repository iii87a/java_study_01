package kr.or.yi.java_study_01.ch03;

public class ForLoop01 {

	public static void main(String[] args) {
		//hardcoding();
		//for(초기화식; 조건식; 증감식)
		//★지역 변수는 반드시 초기화 해야한다. int i; 라고 쓰면 에러.  ★
		//for_loop01();
		  //int dan = 2; (아래 dan for 문 쓰면 중복 선언이므로 주석)
		/*
		 * for(int dan=2; dan<10; dan++) { System.out.println("==== " + dan + "단 ====");
		 * gugudan(dan); }
		 */
		//int i = 1;
		/*
		 * for(int i=1; i<10; i++) { for(int dan= 2; dan<10; dan++) {
		 * System.out.printf("%d * %d = %2d ", dan, i, dan*i); } System.out.println(); }
		 */
		
		//1~10까지 짝수만 출력하기.
			for(int i=1; i<6; i++) {
				System.out.printf("%d ", i * 2);
			}
			System.out.println();
			//for(int i=1; i<11; i++){
	//			 if (i%2==0){
			//           System.out.printf("%d ", i);}
			//}
			
			//for(int i=2; i<11; i=i+2) {
			//	System.out.printf("%d ", i);
				
			//}
			
			//for(int i=2; i<11; i=i+2, System.out.printf("%d ", i)); 
			// -> 4, 6, 8, 10 , 12 출력 (i=10 에서 넘어가서 i + 2 = 12 를 출력하고 나서 i<11  조건으로 가서 false 돼서 나감
			
		
		//1~10까지 홀수만 출력하기.
			for(int i=1; i<11; i=i+2) {
				System.out.printf("%d ", i);
			}
			
			
			int i = 2;
			if(i == 2); // 조건 만족해도 수행안함
			//System.out.println("짝수");
			
			System.out.println();
			
			//1부터 10까지의 합계
			
		/*
		 * int sum; for(int j=1; j<11; j++) { System.out.println(sum+=j); }
		 */
			
	}

	private static void gugudan(int dan) {
		for(int i= 1; i<10; i++) {
			  System.out.printf("%d * %d = %d %n", dan, i, dan*i);
		  }
	}

	private static void for_loop01() {
		for(int i=0; i<10; i++ ) {
			System.out.println("Hello Java!" + i);
		}
		System.out.println("done");
	}

	private static void hardcoding() {
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
		System.out.println("Hello Java!");
	}

}
