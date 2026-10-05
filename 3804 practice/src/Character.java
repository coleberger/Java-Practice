
public class Character {
protected double health;
//Constructor
public Character(double health) {
this.health = health; //shadowing
}
public void setHealth(double health) {
this.health = health;
}
public double getHealth() {
return health;
}
public double attack(double power) {
return -power;
}
public String toString() {
return "Health: " + health;
}
}