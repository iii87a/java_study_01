package ch05ActualTest05;

public class Won2Dollar extends Converter {

	public Won2Dollar(int ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double val) {	
		return val/this.ratio;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}

}
