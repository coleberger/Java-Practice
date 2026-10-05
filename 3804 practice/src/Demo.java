
public class Demo {

	public static void main(String[] args) {
		
			Scorpion s1 = new Scorpion(100, 50);
			SubZero sz1 = new SubZero(100, -20);
			classicSubZero csz1 = new classicSubZero(100, -20, 0);
			CyberSubZero cysz1 = new CyberSubZero(100, -20, 0);
			s1.teleport();
			double damage = s1.attack(20);
			sz1.gotHit(damage);
			System.out.println("SubZero's " + sz1);
			sz1.freeze();
			damage = sz1.attack(20);
			s1.gotHit(damage);
			System.out.println("Scorpion's " + s1);
			 csz1.attack(20);
			 csz1.attack(25);
			 cysz1.gotHit(20);
			 cysz1.gotHit(25);
			 cysz1.attack(10);
			 csz1.gotHit(10);
			 System.out.println("classicSubZero's " + csz1);
			 System.out.println("CyberSubZero's " + cysz1);
			}
			

	}


