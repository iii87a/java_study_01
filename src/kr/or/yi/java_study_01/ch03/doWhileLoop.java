package kr.or.yi.java_study_01.ch03;

public class doWhileLoop {

	public static void main(String[] args) {
		doWhile();

	}

	private static void doWhile() {
		char c = 'a';
		
		do {
			System.out.print(c);
			c = (char) (c+1);
		} while( c <= 'z');
	}

}
