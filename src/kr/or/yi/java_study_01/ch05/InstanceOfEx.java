package kr.or.yi.java_study_01.ch05;

class A{
	void prnA() {System.out.println("a");};
}
class B extends A{
	void prnB() {System.out.println("b");};
}
class C extends B{
	void prnC() {System.out.println("c");};
	
}
public class InstanceOfEx {
	//부모는 자식을 참조  할 수 있으나 자식은 부모를 참조할 수 없다
	public static void main(String[] args) {
		//cast01();
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		prnObj(a);
		prnObj(b);
		prnObj(c);
	

	}
 
	private static void prnObj(A a) { //부모 클래스 A 로 받을 수 있기 때문에 prnObj a 만 있어도 오류 발생 x 
		if(a instanceof C) {
			C cc =(C)a;
			cc.prnC();
		}else if(a instanceof B) {
			B bb = (B) a;
			bb.prnB();
		}else if(a instanceof A) {
			a.prnA();
		}
			
		
		
	}

	private static void cast01() {
		//A a = new C(); //최하위 클래스 확인
		  //A a = new B(); 
		  A a = new A();//최상위 클래스 확인
		  
		  
		  
		if(a instanceof C) {
			System.out.println("a는 C의 객체를 가지고 있음.");
		}
		if(a instanceof B) { //else if 로 바꾸면 a 만 출력
			System.out.println("a는 B의 객체를 가지고 있음");
		}
		if(a instanceof A) {
			System.out.println("a는 A의 객체를 가지고 있음");
		}
	}

}
