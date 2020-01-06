package kr.or.yi.java_study_01.Exam;

public class JavaTestMain {

	public static void main(String[] args) {
		//prnTest();
		
		JavaTestMain tm = new JavaTestMain();
		tm.prnTest();
		
	}
	
	
	
	public static void prn() {
		
		
		System.out.println("ㅎㅎㅎ");
	}
	public void prnTest() {
		System.out.println("haha");
		JavaTestMain.prn();
		prn();
	}

}
