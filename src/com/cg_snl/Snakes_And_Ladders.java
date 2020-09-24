package com.cg_snl;

import java.util.Random;

public class Snakes_And_Ladders {
	
	public static void main(String[] args) {
		int pos=0;
		
		Random rand =new Random();
		int dice=rand.nextInt(6)+1;
		
		int option=rand.nextInt(3);
		switch (option) {
		case 0:
			System.out.println("No Play.");
			break;
		case 1:
			System.out.println("Ladder.");
			pos=pos+dice;
			break;
		case 2:
			System.out.println("Snake.");
			pos=pos-dice;
			break;
			
		}
		System.out.println("New Position: "+ pos);
		
		
	}

}
