package ch05ActualTest05;

import java.util.Scanner;

public class StackAppEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("총 스택 저장 공간의 크기 입력 >> ");
		int space = sc.nextInt();
		StringStack st = new StringStack(space);
		st.run(sc);
	}

}
