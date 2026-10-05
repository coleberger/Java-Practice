
public class classicSubZero extends SubZero {
	protected double powerBar;
	public classicSubZero(double h, int temp, double p) {
		super(h, temp);
		powerBar = p;
	}
	public double attack(double power) {
		System.out.println("Classic subZero uses frfozen fist");
		powerBar += power/2;
		return -power*1.1;
	}
	public String toString() {
		return super.toString() + "power: " + powerBar;
	}
}
