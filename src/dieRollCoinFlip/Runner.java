package dieRollCoinFlip;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Runner {

	public static void main(String[] args) {
		
		boolean running = true;
		int currentSelected = 0;
		int numCoins;
		int numDie;
		int numSides;
		Scanner reader = new Scanner(System.in);
		
		while(running) {
			
			if(currentSelected > 3 || currentSelected < 0) {
				System.out.println("Please enter a value between one and three");
				currentSelected = 0;
				continue;
			}
			
				switch(currentSelected) {
			
				case 0:
					System.out.println("Would you like to flip a coin or roll a die?\n1.Coin\n2.Die\n3.Exit");
					currentSelected = reader.nextInt();
				break;
				
				case 1:
					System.out.println("How many coins would you like to flip?");
					numCoins = reader.nextInt();
					CoinList c = new CoinList(numCoins);
					System.out.println("Would you like to flip each coin only once or continue to flip until each coin lands on the same side?\n1. Once\n2. Until each coin lands on the same side\nNote: Selecting the second option may result in having to restart the program.");
					currentSelected = reader.nextInt();
					switch(currentSelected) {
					case 1:
						c.flipCoins();
						System.out.println(c);
					break;
					case 2:
						c.flipUntilAllAreOneSide();
					}
				currentSelected = 0;
				c.delete();
				break;
				case 2:
					System.out.println("How many die would you like to roll?");
					numDie = reader.nextInt();
					System.out.println("How many sides would you like each die to have?");
					numSides = reader.nextInt();
					DieList d = new DieList(numDie, numSides);
					System.out.println("Would you like to roll only once or continue to roll until each die lands on the same side?\n1. Once\n2. Until each die lands on the same side\nNote: Selecting the second option may result in having to restart the program.");
					currentSelected = reader.nextInt();
					switch(currentSelected) {
					case 1:
						d.rollDie();
						System.out.println(d);
					break;
					case 2:
						d.rollUntilAllAreSameSide();
					}
				currentSelected = 0;
				d.delete();
					currentSelected = 0;
				break;
				case 3:
					running = false;
				break;
			}
		}
		System.exit(0);
	}
}
	
