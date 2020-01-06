package kr.or.yi.java_study_01.ch02;

public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 * System.out.println('a' > 'b'); // f System.out.println(3 >= 2); // t
		 * System.out.println(-1 < 0); // t System.out.println(3.45 <= 2); // f
		 * System.out.println(3 == 2); // f System.out.println(3 != 2); // t
		 * System.out.println(!(3 != 2)); // f
		 * 
		 * 
		 * System.out.println((3 > 2) && (3 > 4)); // f System.out.println((3 != 2) ||
		 * (-1 > 0)); // t System.out.println((3 != 2) ^ (-1 > 0)); // t
		 * 
		 * ternaryOperator();
		 */
		
		System.out.printf("%x%n", 10);  //
		System.out.printf("%4x%n", 10);  // 
		System.out.printf("%04x%n", 10);  // (남는자리를 채우는)(자릿수)x
		ternaryOperator();
	}
	
	private static void ternaryOperator() {
		int a = 5;
		int b = 3;
		
		int res = a > b ? a - b : b - a;
		System.out.printf("두 수의 차는 %d%n", res);
	}
	
	

}
