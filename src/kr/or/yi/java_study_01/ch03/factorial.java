package kr.or.yi.java_study_01.ch03;

public class factorial {

	public static void main(String[] args) {
		
		//fac(5);
		fibo(10);
	}
//제0항을 0, 제1항을 1로 두고, 둘째 번 항부터는 바로 앞의 두 수를 더한 수로 놓는다.
	private static void fibo(int fibo) {
		int f1 = 0;
		int f2 = 1;
		int f3 = f1 + f2;
		
		for(int i =1; i < fibo; i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		
		}
		System.out.print(f3);
	
		
	}

	private static void fac(int cnt) {
		int res = 1;
		
		for(int i=1; i<6; i++) {
			res = res*i;
		}
		System.out.print(res);
		
		
	}

}
