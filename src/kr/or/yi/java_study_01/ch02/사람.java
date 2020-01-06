package kr.or.yi.java_study_01.ch02;

public class 사람 {
	private int age;
	private String name;
	
	
	public 사람(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return String.format("사람 [age=%s, name=%s]", age, name);
	}




	public static void main(String[] args) {
		사람 lsw = new 사람(28, "황하나");
		System.out.println(lsw);
		
		사람 bjw = new 사람(40, "배진우");
		System.out.println(bjw);
	}
}
