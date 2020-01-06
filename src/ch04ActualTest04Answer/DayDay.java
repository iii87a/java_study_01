package ch04ActualTest04Answer;

public class DayDay {
	private String work;

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	
	public void show() {
		if(this.work == null) {
			System.out.println("없습니다.");
			return;
		}
		System.out.println(work + " 입니다.");
		//리턴문이 빠지면 else 넣어야함 
	}
}
