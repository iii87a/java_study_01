package kr.or.yi.java_study_01.ch02;

import java.util.Scanner;

public class scannerEx {
	
	public static void main(String[] args) {
		System.out.print("이름, 도시, 나이, 체중, 독신여부를 빈칸으로 분리하여 입력하시오. >>");
		Scanner sc = new Scanner(System.in);
		
//		System.out.println(sc.nextLine());
		
		String name = sc.next();
		String city = sc.next();
		int age = sc.nextInt();
		double weight = sc.nextDouble();
		boolean isSingle = sc.nextBoolean();
		System.out.printf("이름 %s 도시 %s 나이 %d 체중 %.2f 독신여부 %b %n",
							name, city, age, weight, isSingle);
		
		
		sc.close();
	}

}
