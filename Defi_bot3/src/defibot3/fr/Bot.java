package defibot3.fr;

public class Bot {
	private String bot = "Tarpaud";
	private int strength = 1;
	private int health = 100;
	
	public Bot() {
	}
	
	public String getBot(){
		return bot;
	}
	
	public int getStrength(){
		return strength;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
			
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
}

