package ch04ActualTest04;

import java.util.Scanner;

public class Dictionary {
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	
	
	
	public void findWord(Scanner sc) {
	
		
		while(true) {
			System.out.println("한글 단어? >> ");
			String word = sc.next();
			if(word.equals("그만")) {
				System.out.print("종료합니다.");
				break;
			}
			else {
				kor2Eng(word);
				}
		}
		
	}
	
	public void kor2Eng(String word) {
		
		int i;
		
		for(i=0; i<kor.length; i++) {
			if(word.equals(kor[i])) {
				System.out.println(word + "은 영어로 " + eng[i]);
				break;
			}
		}
		if(i == kor.length) {
			System.out.println(word + "는 사전에 없습니다.");
		}
		
		
	}
}	
