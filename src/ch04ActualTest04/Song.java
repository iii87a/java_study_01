package ch04ActualTest04;

public class Song {
	private String title;
	private String artist;
	private int year;
	private String country;
	

	

	public Song(int year, String country, String artist, String title) {
		this.year = year;
		this.country = country;
		this.artist = artist;
		this.title = title;
	}
	



	public void show() {
		System.out.println(year + "년 " + country +"국적의 " + artist + "가 부른 " + title);
		
	}
	
	
	
	
	
	
	
	
	
}
