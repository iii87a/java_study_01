package ch05ActualTest05;

public class TvEx {

	public static void main(String[] args) {
		ColorTv myTv = new ColorTv(32, 1024);
		myTv.prnProperty();
		
		Iptv ip = new Iptv("192.1.1.2", 32, 2048);
		ip.prnProperty();
	}
	
	

}
