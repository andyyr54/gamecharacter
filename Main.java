package GameCharacter;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
	Random hp = new Random();
	Random att = new Random();
	character c1 = new character(hp.nextInt(201), att.nextInt(21), "Alaisia", 0.1);
	character c2 = new character(hp.nextInt(201), att.nextInt(21), "Andy", 0.1);
	
	
	while(c1.isAlive() && c2.isAlive()) {
		c1.attack(c2);
		if(c2.isAlive()) {
			c2.attack(c1);
		}
	}
	if(c1.isAlive()) {
		System.out.println(c1.getName() + " is the winner!");
	}
	else if(c2.isAlive()) {
	System.out.println(c2.getName() + " is the winner!");
	}
	}

}
