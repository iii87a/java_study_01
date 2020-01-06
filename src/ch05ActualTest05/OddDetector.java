package ch05ActualTest05;

abstract class OddDetector {
	protected int n;
	
	public OddDetector (int n) {
		this.n = n;
	}
	
	public abstract boolean isOdd();
}
