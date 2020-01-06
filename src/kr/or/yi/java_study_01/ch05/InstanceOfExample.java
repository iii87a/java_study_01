package kr.or.yi.java_study_01.ch05;

class Person1 { }
class Student1 extends Person1 { }
class Researcher1 extends Person1 { }
class Professor1 extends Researcher1 { } 


public class InstanceOfExample {
	
	static void print(Person1 p) {
		if(p instanceof Person1) {
			System.out.println("Person");
		}
		if(p instanceof Student1) {
			System.out.println("Student");
		}
		if(p instanceof Researcher1) {
			System.out.println("Researcher");
		}
		if(p instanceof Professor1) {
			System.out.println("Professor");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		System.out.println("new Student1() -> \t");
		print(new Student1());
		System.out.println("new Researcher1() -> \t");
		print(new Researcher1());
		System.out.println("new Professor1() -> \t");
		print(new Professor1());
		
	}


}
