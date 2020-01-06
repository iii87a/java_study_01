package kr.or.yi.java_study_01.ch03;

public class ContinueLoop {

	public static void main(String[] args) {
		//gugudan_continue();
		//gugudan_break();
		
		//gugudan_break2();
		  evenhap(); // 짝수 합
		  oddhap(); //홀수 합
		  threesum(); //3의 배수의 합
		
		  
	}

	private static void threesum() {
		//3의 배수의 합
		int ans = 0;
		for(int i=1; i<101; i++) {
			if(i%3 == 0) {
				ans = ans + i;
			}
		}
		System.out.print(ans);
		System.out.println();
		
	}

	private static void oddhap() {
		// 홀수의 합
		int ans = 0;
		for(int i=1; i<101; i++) {
			if(i%2 != 0) {
			ans = ans + i;
			}
		}
		System.out.print(ans);
		System.out.println();
		
	}

	private static void evenhap() {
		//1부터 100까지의  짝수의 합을 구하는 프로그램을 작성
		int ans = 0;
		for(int i=1; i<101; i++) {
			
			if(i%2 == 0) {
				ans = ans + i;
			}
		}
		System.out.print(ans);
		System.out.println();
		
		
	}

	private static void gugudan_break2() {

	}

	private static void gugudan_break() {
		int res = 1;
		
		for(int n = 2; n<10; n++) {
			for(int i=1; i<10; i++) {
			res = n * i;
			
			if(i == 6) {
				break;
			}
			System.out.print(n + " * " + i + " = ");
			System.out.print(res + " ");
			}
			
			System.out.println();
		}
	}

	private static void gugudan_continue() {
		int res = 1;
		
	for(int n=2; n<10; n++) {	
		for(int i=1; i<10; i++) {
			res = n * i;
			
			if(i == 5) {
				System.out.println();
				continue;
			}
			System.out.print(n + " * " + i + " = ");
			System.out.print(res + "  ");
		}
		System.out.println();
		System.out.println();
	  }
	}

}
