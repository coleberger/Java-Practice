public class SubZero extends Character {
private int temperature;
public SubZero(double h, int temp) {
super(h);
temperature = temp;
}
@Override
public double attack(double power) {
System.out.println("---Ice Attack---");
return -power*1.1;
}
public void freeze() {
System.out.println("--The other character froze for 3 seconds--");
}
public void gotHit(double damage) {
double newHealth = super.getHealth() - damage*.90;
super.setHealth(newHealth);
}
public String toString() {
	return super.toString() + "temperature: " + temperature;
}
}
