package defibot3.fr;

import java.util.Random;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Player player1 = new Player(null);

		Bot bot1 = new Bot();
		Scanner s = new Scanner(System.in);
		Random randice = new Random();
		Random randf = new Random();

		
		System.out.print("Quel est votre pseudo ? ");
		String pseudo = s.next();
		player1.setPseudo(pseudo);
		
		Scanner scanner = new Scanner(System.in);
		String  readString = "";
		
		boolean isAlive = true;
		int min = 1;
		int max = 2;
		int level = 1;
		while (isAlive) {
			int tour = 1;
			System.out.println("------------------------------------------------------------");
			System.out.println("STAT DU BOT: Bot de niveau " + level + " | Force du bot : " + bot1.getStrength() + " | Point de vie du bot : " + bot1.getHealth() + "%");
			System.out.println("STAT DE " + player1.getPseudo() +": " + " Force de " + player1.getPseudo() + " : " + player1.getStrength() + " | Point de vie de " + player1.getPseudo() + " : " + player1.getHeatlh() + "%");
			System.out.println("------------------------------------------------------------");
			do {
				int first_attack = randf.nextInt((max - min) + 1) + min;
				int dice = Rolldice.getRolldice();
				if(first_attack == 1) {
					do{
						System.out.println(player1.getPseudo() + ", appuyer sur entrée pour lancer les dés");
						scanner.nextLine();
					}while(scanner.nextLine() != readString);
					System.out.println(player1.getPseudo() + " lance les dés... " + dice * player1.getStrength());
					System.out.println(player1.getPseudo() + " assène un coup sur le bot de niveau " + level + " avec une force de " + dice * player1.getStrength());
					int resulthealth_bot = bot1.getHealth() - dice;
					bot1.setHealth(resulthealth_bot);
					System.out.println("BOT de niveau " + level + " - Santé " + bot1.getHealth() + "%");
					System.out.println("Fin du tour " + tour);
					System.out.println("------------------------------------------------------------");
					tour++;
				}
				else {
					System.out.println("Bot de niveau " + level + " lance les dés... " + dice * bot1.getStrength());
					System.out.println("Bot de niveau " + level + " assène un coup sur " + player1.getPseudo() + " avec une force de " + dice * bot1.getStrength());
					int resulthealth_player = player1.getHeatlh() - dice;
					player1.setHeatlh(resulthealth_player);
					System.out.println(player1.getPseudo() + " - Santé " + player1.getHeatlh() + "%");
					System.out.println("Fin du tour " + tour);
					System.out.println("------------------------------------------------------------");
					tour++;
					
					
				}
				
			}while(player1.getHeatlh() > 0 && bot1.getHealth() > 0);
			
			if(player1.getHeatlh() <= 0) {
				System.out.println("VOUS AVEZ PERDU");
				isAlive = false;
			}
			else if(bot1.getHealth() <= 0) {
				System.out.println("VOUS AVEZ GAGNER");
				int xpbot[] = Victory.ifVictoryPlayer(3, 7);
				int xpplayer[] = Victory.ifVictoryPlayer(2, 5);
				bot1.setHealth(100);
				player1.setHeatlh(100);
				level++;
				int new_health_bot = (bot1.getHealth() + (xpbot[1]) * level);
				int new_strength_bot = (bot1.getStrength() + (xpbot[0]) * level);
				int new_health_player = (player1.getHeatlh() + (xpplayer[1]) * level);
				int new_strength_player = (player1.getStrength() + (xpplayer[0]) * level);
				player1.setHeatlh(new_health_player);
				player1.setStrength(new_strength_player);
				bot1.setHealth(new_health_bot);
				bot1.setStrength(new_strength_bot);
				Victory.sendVictoryPlayer(level);
				System.out.println("------------------------------------------------------------");
			}
		}

	}
}

	
