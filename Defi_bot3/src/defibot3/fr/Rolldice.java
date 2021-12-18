package defibot3.fr;

import java.util.Random;


public class Rolldice {

	public static int getRolldice(){
		Random randice = new Random();
		int dice_min = 1;
		int dice_max = 6;
		int dice1 = 1;
		int dice2 = 1;
		dice1 = randice.nextInt((dice_max - dice_min) + 1) + dice_min * 2;
		dice2 = randice.nextInt((dice_max - dice_min) + 1) + dice_min * 2;
		int dice3 = dice1 + dice2;
		return dice3;
	}

}
