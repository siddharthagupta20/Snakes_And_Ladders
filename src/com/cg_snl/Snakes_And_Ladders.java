package com.cg_snl;

import java.util.Random;

public class Snakes_And_Ladders {

	public static void main(String[] args) {
		int pos = 0;
		Random rand = new Random();
		boolean player1Playing = true;
		int noOfTurns=1;
		int turn = 0;
		while (pos != 100) {
			int dice = rand.nextInt(6) + 1;

			int option = rand.nextInt(3);
			switch (option) {
			case 0:
				break;
			case 1:

				pos = pos + dice;
				break;
			case 2:
				pos = pos - dice;
				break;
			}
			if (pos > 100) {
				pos -= dice;
				System.out.println("No Play b/c pos. above 100.");
			}

			if (pos < 0)
				pos = 0;

			System.out.println("New Position: " + pos);
			if (pos == 100) {
				break;
			}


						pos1 = pos1 - dice;
						onLadder = false;
						break;
					}
				}
				if (pos1 > 100)
					pos1 -= lastRoll;
				if (pos1 < 0)
					pos1 = 0;
				if (pos1 == 100) {
					System.out.println("Player 1 Won.");
					System.out.println("Total No. of turns: "+noOfTurns);
					System.out.println("Position of Player1: "+pos1+"\nPosition of Player2: "+pos2 );
					break;
				}
				player1Playing = false;
			turn++;
		}
		System.out.println("Turns: " + turn);
				int lastRoll = 0;
				while (onLadder) {
					int dice = rand.nextInt(6) + 1;
					int option = rand.nextInt(3);
					switch (option) {
					case 0:
						onLadder = false;
						break;
					case 1:
						lastRoll = dice;
						pos2 = pos2 + lastRoll;
						break;
					case 2:
						onLadder = false;
						pos2 = pos2 - dice;
						break;
					}
				}
				if (pos2 > 100)
					pos2 -= lastRoll;
				if (pos2 < 0)
					pos2 = 0;
				if (pos2 == 100) {
					System.out.println("Player 2 Won.");
					System.out.println("Total No. of turns: "+noOfTurns);
					System.out.println("Position of Player1: "+pos1+"\nPosition of Player2: "+pos2 );
					break;
				}
				player1Playing = true;

			}
			noOfTurns++;
		}
	}

}
