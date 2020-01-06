package kr.or.yi.java_study_01.ch03;

public class whileLoop02 {

	public static void main(String[] args) {
		//gugudan_for(2);
		//gugudan_while(2);
		//gugudan_full_for();
		//gugudan_full_while();
		//gugudan_landscape(2);
		// factorial_for(5);
		// factorial_while(5);
		// fibo_for(10);
		fibo_while(10);


	}

	
	
	private static void gugudan_landscape(int n) {
		int res = 1;
	System.out.println("구구단 landscape");
	for(int p=2; p<10; p++) {
		for(int i=1; i<10; i++) {
			res = n * i;
			System.out.print(n + " * " + i + " =  ");
			System.out.print(res + "   ");
			
		}
		System.out.println();
		n++;
		
	 }		
 }



	private static void fibo_while(int cnt) {
		int f1 = 0;
		int f2 = 1;
		int f3 = f1 + f2;
		
		int i = 1;
		while(i<cnt){
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			i++;
		}
		System.out.print(f3);
		
	}



	private static void fibo_for(int cnt) {
		int f1 = 0;
		int f2 = 1;
		int f3 = f1 + f2;
		
		for(int i=1; i<cnt; i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		System.out.print(f3);
		
	}



	private static void factorial_while(int n) {
		int res = 1;
		int i = 1;
		System.out.print(n + "! = ");
		while(i<n+1) {
			res = res * i;
			System.out.printf("%d %s ", i, i==n?"=":"*");
			i++;
		}
		System.out.print(res);
		
	}



	private static void factorial_for(int n) {
		int res = 1;
		System.out.print(n + "! = ");
		for(int i=1; i<n+1; i++) {
			res = res * i;
			System.out.printf("%d %s ", i, i==n?"=":"*");
		}
		System.out.print(res);
	}



	private static void gugudan_full_while() {
		int res;
		int i = 1;
		int n = 2;
	
	while(n<10) {
		System.out.println(n + "단");
		while(i<10) {
			res = n * i;
			System.out.println(n + " * " + i + " = " + res);
			i++;
			
		}
		i = 1;
		n++;
	 }	
  }



	private static void gugudan_full_for() {
		int res;
		
		for(int n=2; n<10; n++) {
			System.out.println( n + "단");
			for(int i=1; i<10; i++) {
				res = n * i;
				System.out.println(n + " * " + i + " = " + res);
			}
		}	
	}




	private static void gugudan_while(int n) {
		int res;
		System.out.println("2단");
		int i = 1;
		while(i<10) {
			res = n * i;
			System.out.println(n + " * " + i + " = " + res);
			i++;
		}
		
		
		
	}




	private static void gugudan_for(int n) {
		int res = n * 1;
		System.out.println("2단");
		for(int i=1; i<10; i++) {
			 res = n * i;
			 System.out.println( n + " * " + i + " = " + res  );
		}
		
		
	}

}
