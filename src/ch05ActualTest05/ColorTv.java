package ch05ActualTest05;

public class ColorTv extends Tv {
	private int color;
	
	public ColorTv(int size, int color) {
		super(size);
		this.setSize(size);
		this.color = color;
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int getColor() {
		return color;
	}



	public void setColor(int color) {
		this.color = color;
	}



	public void prnProperty() {
		System.out.println( this.getSize() + "인치 " + color + "컬러 ");
	}


	
	

}
