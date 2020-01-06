package kr.or.yi.java_study_01.ch04_p;

import kr.or.yi.java_study_01.ch04_Q.B;

class A {
	void f() {
		B b = new B();
		//B 클래스는 A 클래스가 있는 p 패키지 안에 있지 않으므로
		//B 클래스가 public 이더라도 이 패키지 안에서 사용하려면 import 필요
		
		//C c = new C();
		//C -> 디폴트 클래스 : 다른 패키지에서 사용 불가
	}
}
