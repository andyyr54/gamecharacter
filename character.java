package GameCharacter;
import java.util.Random;

public class character {
	int hp; 
	int attackDmg; 
	String charName; 
	double crit;
	
public character(int hp, int attackDmg, String charName, double crit) {
	this.hp = hp; 
	this.attackDmg = attackDmg; 
	this.charName = charName;
	this.crit = crit; 
}



public boolean isAlive() {
if(hp > 0) {
	return true; 
}
else
	return false; 
	
} 

public int gethp() {
	return hp;
}

public void setHP(int newHP) {
	this.hp = newHP; 
}

public int getAttackDmg() {
	return attackDmg;
}

public void setAttackDmg(int newAttackDmg) {
	this.attackDmg = newAttackDmg;
}
public String getName() {
	return charName; 
	
}
public void setName(String newcharName) {
	this.charName = newcharName; 
	
}



public void takeDmg(int dmg) {
hp = hp - dmg; 
System.out.println(this.charName + ": " + this.hp + " hp left");

}

public int critHit() {
	 Random crit = new Random();
	 if (crit.nextDouble() < this.crit) {
		 System.out.println(this.charName + " performed a critical hit!");
		 return this.attackDmg * 2; 
	 }
	 return attackDmg; 
}

public void attack(character opp) {
	int damage = critHit();
	System.out.println(this.charName + " attacks " + opp.charName + " for " + damage + " dmg");
	opp.takeDmg(damage);
	
}

}