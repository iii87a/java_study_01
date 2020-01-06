package kr.or.yi.java_study_01.ch04;

public class Book {
	String title;
	String author;

	public Book(String title) { // 생성자
		this.title = title;
		this.author = "작자미상";
	}

	
	public Book(String title, String author) {// 생성자
		this.title = title;
		this.author = author;
	}
	
	public Book() {
		this("춘향뎐", "작자미상");
		System.out.println("매개변수가 없는 생성자");
		
	}


	@Override
	public String toString() {
		return String.format("Book [title=%s, author=%s]", title, author);
	}


}
