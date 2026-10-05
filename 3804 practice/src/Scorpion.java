
public class Scorpion extends Character{
private int chainRange;
//Constructor
public Scorpion(double h, int cr) {
super(h); //super(): superclass constructor (must be the first statement in the constructor)

chainRange = cr;
}
//method overriding
@Override //telling Java we're overriding a superclass method
public double attack(double power) {
System.out.println("Get over here!");
return -power * 1.2;
}
//Method overloading: Same method name, different parameters
//Method overriding: Same method name & same parameters
public void teleport() {
System.out.println("---Scorpion teleported---");
}
public void gotHit(double damage) {
health += damage;
//super.setHealth(newHealth); // health = newHealth

}
}