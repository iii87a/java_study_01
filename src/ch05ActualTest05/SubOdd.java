package ch05ActualTest05;

public class SubOdd extends OddDetector {

	
	public SubOdd(int n) {
		super(n);
	}
	
	@Override
	public boolean isOdd() {
		if(this.n%2 != 0) {
			return true;
		}
		return false;
	}

}
