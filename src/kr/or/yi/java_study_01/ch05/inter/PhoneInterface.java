package kr.or.yi.java_study_01.ch05.inter;

public interface PhoneInterface {
	// 상수, 추상 메서드, 디폴트 메서드만 선언 가능

	public static final int TIMEOUT = 1000; // 상수
	// public static final 생략 가능

	public abstract void sendCall();// 추상 메서드
	// public abstract 생략 가능

	void receiveCall(); // 추상 메서드

	default void prnLogo() {
		System.out.println("** phone **s");
	}
}
