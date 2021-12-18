package defibot3.fr;

public class Victory {
	
	public static int[] ifVictoryPlayer(int xp_dmg, int xp_hp) {
		return new int[] {xp_dmg, xp_hp};
		
	}
	
	public static void sendVictoryPlayer(int i) {
		System.out.println("NOUVEAU BOT DE NIVEAU " + i);
	}
	
}
	


