package kr.or.yi.java_study_ch04ActualTest04;

public class Tv {
	private String brand;
	private int year;
	private int size;
	
	
	public Tv() {//생성자
		
	}


	public Tv(String brand, int year, int size) {
		this.brand = brand;
		this.year = year;
		this.size = size;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public void show() {
		System.out.println(brand + "에서 만든 " + year + "년형 " + size + "인치 TV");
		
	}


	
	
}