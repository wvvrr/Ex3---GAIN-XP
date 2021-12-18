package defibot3.fr;

public class Player {
	private String pseudo = null;
	private int health = 100;
	private int strength = 1;
		
	public Player(String pseudo) {
		this.pseudo = pseudo;
	}
		
	public String getPseudo() {
		return pseudo;
	}
		
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
		
	public int getStrength(){
		return strength;
	}
	
	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public int getHeatlh(){
		return health;
	}

	public void setHeatlh(int health) {
		this.health = health;
		
	}

}

