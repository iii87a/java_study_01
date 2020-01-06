package ch04ActualTest04;

public class Add {
	
	private int a;
	private int b;
	
	public void setValue(int num1, int num2) {
		this.a = num1;
		this.b = num2;
		//스캐너로 입력받은 정수 2개를 가져와서 객체의 필드 a,b 로 변경
	}


	public int calculate() {
		int result = a + b;
		return result;
		//객체의 필드 a,b 를 더해서 결과값 리턴 
	}
}
