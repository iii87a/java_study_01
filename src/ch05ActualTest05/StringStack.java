package ch05ActualTest05;

import java.util.Arrays;
import java.util.Scanner;

public class StringStack implements Stack {
	private int space;
	int i;
	String answer;
	private int length;
	
	public StringStack(int space) {
		this.space = space;
	}

	@Override
	public int length() {
		//현재 스택에 저장된 갯수 리턴
		return length;
	}

	@Override
	public int capacity() {
		//스택의 전체 저장 가능한 갯수 리턴
		return this.space;
	}

	@Override
	public String poo() {
		// 스택의 top 에 실수 저장 
		return null;
	}

	@Override
	public boolean push(String val) {
		// 스택의 top 에 저장된 실수 리턴
		//length 1증가
		return false;
	}
	
	
	public void run(Scanner sc) {
		String[] stackArr = new String[space];
		for (i = 0; i < space + 1; i++) {
			System.out.println("문자열 입력 >> ");
			answer = sc.next();
			
			if (answer.equals("그만")) {
				System.out.println("종료합니다.");
				return;
			}
			// System.out.println(StackArr.length);
			try {
				stackArr[i] = answer;
			// System.out.println(Arrays.toString(stackArr));
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("스택이 꽉 차서 푸시 불가!");
			}

		}
		System.out.println(Arrays.toString(stackArr));

	}

	
}
