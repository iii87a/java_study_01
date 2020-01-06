package ch04ActualTest04;

import java.util.Arrays;
import java.util.Scanner;

public class MonthSchedule {
	Scanner sc = new Scanner(System.in);
	private int day; //4월의 날짜 수
	private Day[] dayArr;


	public MonthSchedule(int day) { 
		  this.dayArr = new Day[day];
	      for(int i=0; i<dayArr.length; i++) {
	    	  dayArr[i] = new Day();
	      }
	      
	}


	public void run() {
		
		System.out.println("할일(입력 : 1, 보기:2, 끝내기: 3)");
		int answer = sc.nextInt();
		
		switch(answer) {
					case 1:
						input();
						break;
					case 2:
						view();
						break;
					case 3:
						finish();
						break;
		}
	}
	
	

	private void finish() {
		
		System.out.println("종료합니다.");
		return;
	}

	private void view() {
		System.out.println("날짜(1~30)");
		int date = sc.nextInt();
		
		dayArr[date-1].show();
		
		run();
		
	}

	private void input() {
		System.out.println("날짜? (1~30)");
			int date = sc.nextInt();
		System.out.println("할일?(빈칸 없이 입력)");
			String work = sc.next();
			
		dayArr[date-1].setWork(work);
		dayArr[date-1].setDate(date);
		
		run();
	}
		
	
}
