package com.BridgeLabz.Day4;

public class SnakeAndLadderUC4_UC5 
{
	public static void main(String args [])
	  {
		
		 System.out.println("Welcome to the Snake and Ladder Game");
		 int position=0;
	     int turn=0;
		 int oldTurn=0;
		 while(position<100) {
		   int Dice_Starting_Range=1;
		   int Dice_Ending_Range=6-Dice_Starting_Range;
		   int dicenumber = (int) (Math.floor(Math.random()*Dice_Ending_Range+Dice_Starting_Range));
		   int option= (int)Math.floor(Math.random()*3);
		  switch (option) {
		  case 0:
			  System.out.println("Player position is Nothing" );
			  break;
		  case 1:
			  System.out.println("Player is in Ladder position ");
			  if(turn==0)
			  position+=dicenumber;
			  if(position >100) {
			  position-=dicenumber;
				  System.out.println("Player exceeds 100");
			   }
			    break;
		  case 2:
			  System.out.println("play Action : Snake");
			  if(turn!=0)
				  position-=dicenumber;
			  if(position <0)
			  {
				  position =Math.max(position, 0);
				  System.out.println("Player reset to 0");
			  }
			  turn=(turn+1)%2;
			  break;
		      }
		    if(oldTurn==0)
			  System.out.println("Current position for player " +  position + "\n");
			   oldTurn=turn;  
		    }
			System.out.println("Cogratulations Player " +(turn+1));	
	 }
}
