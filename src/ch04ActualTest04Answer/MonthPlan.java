package ch04ActualTest04Answer;

import java.util.Scanner;

public class MonthPlan {
	private int nDays; //해당 월의 총 일 수
	private DayDay[] DayArr;
	private Scanner sc;
	
	//Day -> DayDay
	//days 배열 -> DayArr
	
	public MonthPlan(int nDays) {
		this.nDays = nDays;
		this.DayArr = new DayDay[nDays]; //일 수 만큼의 DayDay 객체를 가지는 배열 생성
		this.sc = new Scanner(System.in);
	}
	
	public void input() {
		System.out.print("날짜 (1~30)");
		int dateNum = sc.nextInt();
		

		if(dateNum < 0 || dateNum > nDays) {
			System.out.println("날짜를 잘못 입력하였습니다.");
			System.out.printf("1~ %D 사이의 값을 입력하세요.", nDays);
			return;
		}
		
		System.out.println("할일 (빈칸없이 입력)");
		String toDo = sc.next();
		
		
		DayDay d = new DayDay();
		d.setWork(toDo);
		DayArr[dateNum-1] = new DayDay();
		
	}
	
	public void view() {
		System.out.print("날짜 (1~30)");
		int dateNum = sc.nextInt();
		
		if(dateNum < 0 || dateNum > nDays) {
			System.out.println("날짜를 잘못 입력하였습니다.");
			System.out.printf("1~ %D 사이의 값을 입력하세요.", nDays);
			return;
		}
		
		System.out.println(dateNum + "일의 할 일은");
		if(DayArr[dateNum-1]==null) {
			System.out.println("해당 일에는 할 일이 없습니다.");
			return;
		}
		DayArr[dateNum-1].show();
	}
	
	public void finish(){
		sc.close();
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() {
		System.out.println("이번 달 스케줄 관리 프로그램");
		
		int menu;
		do {
			System.out.println("할일(입력 : 1, 보기:2, 끝내기: 3) >> ");
			menu = sc.nextInt();
			
			switch(menu) {
						case 1:
							input();
							break;
						case 2:
							view();
							break;
			}
		}while(menu < 3);
		finish();
	}

	
	
	
}
