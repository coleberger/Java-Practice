
public class CyberSubZero extends SubZero{
	protected double powerBar;

	public CyberSubZero(double h, int temp, double p) {
		super(h, temp);
		powerBar = p;
	}
	public double attack(double power) {
		System.out.println("Cybersubzero fires the cyber freeze cannon");
		powerBar += power/2;
		return -power*1.1;
	}
	public String toString() {
		return super.toString() + "power: " + powerBar;
	}
	 
	
}
