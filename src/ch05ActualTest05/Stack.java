package ch05ActualTest05;

public interface Stack {
	int length(); //스택에 저장된 갯수 
	int capacity(); // 스택의 전체 저장 가능한 갯수 
	String poo(); // 스택의 top 에 실수 저장
	boolean push(String val); // 스택의 top에 저장된 실수 리턴

}
