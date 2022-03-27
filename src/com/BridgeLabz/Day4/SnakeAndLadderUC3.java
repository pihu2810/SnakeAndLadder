package com.BridgeLabz.Day4;

public class SnakeAndLadderUC3 
{
	public static void main(String args [])
	  {
		 int position=0;
		 System.out.println("Welcome to the Snake and Ladder Game");
		   int Dice_Starting_Range=1;
		   int Dice_Ending_Range=6-Dice_Starting_Range;
		   int dicenumber = (int) (Math.floor(Math.random()*Dice_Ending_Range+Dice_Starting_Range));
		   int option= (int)Math.floor(Math.random()*3);
		  if(option==0) {
			  System.out.println("Player position is" +position);
		  }else if(option == 1) {
			  System.out.println("Player is in Ladder position :" +position);
		  }else if(option==2) {
			  position=dicenumber;
			  System.out.println("Player is bitten by Snake so position will be 0");
			  System.out.println("wait for your next turn");
		  }
	  }
}
