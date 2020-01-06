package ch05ActualTest05;

public class Iptv extends ColorTv {
	private String address;
	
	public Iptv(String address, int size, int color) {
		super(size, color);
		this.address = address;
		this.setSize(size);
		this.setColor(color);
		
	}
	
	public void prnProperty() {
		System.out.println("나의 IPTV는 " + address + ", "+ this.getSize() + "인치 " + this.getColor() + "컬러 ");
	}
	
}
