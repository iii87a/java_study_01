package ch04ActualTest04;

import java.util.Scanner;

public class PhoneBook {
	Scanner sc = new Scanner(System.in);
	private int num;//인원 수
	private Phone[] phArr; //배열
	
	public PhoneBook() {
		this.phArr = new Phone[num];
		
		for(int i=0; i<phArr.length; i++) {
			phArr[i] = new Phone();
		}
	}
	
	
	public void nameNum() {
		System.out.println("인원수 >> ");
		int number = sc.nextInt();
		
		for(int i=0; i<number; i++) {
			System.out.println("이름과 전화번호 >> ");
			String yourName = sc.next();
			String yourNum = sc.next();
			
			phArr[i].setName(yourName);
			phArr[i].setTel(yourNum);
		}
		System.out.println("저장되었습니다...");
		
		
		findWho();
		
	
	}
	
	public void findWho() {
		String findName;
		System.out.println("검색할 이름 >> ");
		findName = sc.next();
		int i;
		for(i=0; i<phArr.length; i++) {
			if(findName.equals(phArr[i].getName())) {
				System.out.println(phArr[i]);
				findWho();
				break;
			}
			else if(findName.equals("그만")){
				System.out.println("종료합니다.");
				break;
			}

		}
		if(i == phArr.length) {
			System.out.println(findName + "은 없는 이름입니다.");
			findWho();
		}
		
	
	}
	
	
}
