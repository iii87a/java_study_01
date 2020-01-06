package ch04ActualTest04;

public class Day {
	private String work;

	
	public Day() {
		// TODO Auto-generated constructor stub
	}

	
	public void setWork(String work) {
		this.work = work;
		
	}
	
	public void setDate(int date) {
		// TODO Auto-generated method stub
		
	}
	
	public String get() {
		return work;
	}
	
	public void show() {
		if(this.work == null) {
			System.out.println("없습니다.");
		}
		else {
			System.out.println(work + "입니다.");
		}
	}

	

	
	
}
