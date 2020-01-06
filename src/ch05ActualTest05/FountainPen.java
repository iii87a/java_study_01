package ch05ActualTest05;

public class FountainPen extends BallPen implements Refill {
	public void refill(int n) {
		this.setAmount(n);
	}
}
