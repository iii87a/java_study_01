package ch04ActualTest04;

public class Phone {
	private String name;
	private String tel;
	
	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return name + "의 전화번호는 " + tel + " 입니다.";
	}
	
	
	
	
}
