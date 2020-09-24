package com.cg_snl;

import java.util.Random;

public class Snakes_And_Ladders {
	
	public static void main(String[] args) {
		
		int pos1=0, pos2=0;
		Random rand =new Random();
		boolean player1Playing=true;
		
		while(pos1!=100&& pos2!=100) {	
		
		boolean onLadder=true;
		
		if(player1Playing) {
			
		int lastRoll=0;
		
		while(onLadder) {
			int dice=rand.nextInt(6)+1;
			int option=rand.nextInt(3);
			
		switch (option) {
		
		case 0:
			
			onLadder=false;
			break;
			
		case 1:
			
			lastRoll=dice;
			pos1+=lastRoll;
			break;
			
		case 2:
			
			pos1=pos1-dice;
			onLadder=false;
			break;	
		}
		}
		if (pos1>100) 
			pos1-=lastRoll;
		if (pos1<0) 
			pos1=0;
		if (pos1==100) {
			System.out.println("Player 1 Won.");
			break;
		}
		player1Playing=false;
		
		
		}
		else {
		
			int lastRoll=0;
			while(onLadder) {
				int dice=rand.nextInt(6)+1;
				int option=rand.nextInt(3);
			switch (option) {
			case 0:
				onLadder=false;
				break;
			case 1:
				lastRoll=dice;
				pos2=pos2+lastRoll;
				break;
			case 2:
				onLadder=false;
				pos2=pos2-dice;
				break;
			}
			}
			if (pos2>100) 
				pos2-=lastRoll;
			if (pos2<0) 
				pos2=0;
			if(pos2==100){
				System.out.println("Player 2 Won.");
				break;
			}
			player1Playing=true;
		
			
		}
		}
		
	}

}

