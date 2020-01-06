package kr.or.yi.java_study_01.ch03.array;

public class JavaTest {

	public static void main(String[] args) {
		work3_2();
		System.out.println();
		work3_3();
		System.out.println();
		work3_4();
		System.out.println();
		work3_5();
		System.out.println();
		work4_1();
		System.out.println();
		work4_2();
		System.out.println();
		work4_3();
		System.out.println();
		work4_4();
		System.out.println();
		work4_5();
		System.out.println();
		work4_6();
		System.out.println();
		work4_7();
	}

	private static void work4_7() {
		
		
	}

	private static void work4_6() {
		System.out.println("===4-6===");
		int i;
		int sum;
		
		i = 1;
		sum = 0;
		do {
			sum += i++;
		}while(i<=10);
		System.out.printf("%d, %d\n", i , sum);
		
	}

	private static void work4_5() {
		System.out.println("===4-5===");
		int i;
		int sum;
		for(i=0, sum=0; i<=9; sum+= ++i) {
			System.out.printf("%d, %d\n", i, sum);
		}
		
	}

	private static void work4_4() {
		System.out.println("===4-4===");
		int i;
		int sum;
		for(i=1, sum=0; i<=10; sum+= i++) 
			System.out.printf("%d, %d\n", i, sum);
		
	}

	private static void work4_3() {
		System.out.println("===4-3===");
		int i;
		int sum;
		for(i=0, sum=0; i<=9;) 
			sum += ++i;
			System.out.printf("%d, %d\n", i, sum);
		
	}

	private static void work4_2() {
		System.out.println("===4-2===");
		int i;
		int sum;
		for(i = 1, sum = 0; i<=10;) 
			sum += i++;
			System.out.printf("%d, %d\n", i, sum);
		
		
	}

	private static void work4_1() {
		System.out.println("==4-1==");
		int i;
		int sum;
		for(i =1, sum=0; i<=10; i++) 
			sum += i;
			System.out.printf("%d, %d\n", i, sum);
		
		
		
	}

	private static void work3_5() {
		System.out.println("==3-5==");
		int i = 1;
		do {
			System.out.print(i + " ");
			if(i%5 == 0) break;
		}while (i++ <= 10);
		
	}

	private static void work3_4() {
		System.out.println("==3-4==");
		int n = 0;
		while(n <= 10) {
			if(n%2 == 0) {
				n++;
				continue;
			}
			System.out.print(n++ + " ");
		}
		
	}

	private static void work3_3() {
		System.out.println("==3-3==");
		int n =3;
		while(n < 7) {
			System.out.println(++n);
		}
		
	}

	private static void work3_2() {
		System.out.println("==3-2==");
		for(int i=1; i<=10; i++) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		for(int i=1; i<=10; ++i) {
			System.out.printf("%d ", i);
		}
		System.out.println();
		for(int i=1; i<=10;) {
			System.out.printf("%d ", ++i);
		}
		System.out.println();
		for(int i=1; i<=10;) {
			System.out.printf("%d ", i++);
		}
		
	}

}
