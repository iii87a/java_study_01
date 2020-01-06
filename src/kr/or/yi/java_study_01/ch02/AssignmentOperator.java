package kr.or.yi.java_study_01.ch02;

public class AssignmentOperator {

	public static void main(String[] args) {
		assginmentIncDec();
	}
	

	private static void assginmentIncDec() {
		int a = 3;
		int b = 3;
		int c = 3;
		
		a = a + 3;
		b = b * 3;
		c = c % 2;
		System.out.printf("a= %d, b= %d, c= %d%n", a, b, c);
		
		int d = 3;
		
		a = d++;
		System.out.printf("a= %d, d= %d%n",a,d);
		a = ++d;
		System.out.printf("a= %d, d= %d%n",a,d);
		a = d--;
		System.out.printf("a= %d, d= %d%n",a,d);
		a = --d;
		System.out.printf("a= %d, d= %d%n",a,d);
	}

}
