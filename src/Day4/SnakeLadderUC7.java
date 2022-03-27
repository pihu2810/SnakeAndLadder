package Day4;

public class SnakeLadderUC7 
{
	public static void main(String args [])
	  {
		
		 System.out.println("Welcome to the Snake and Ladder Game");
		 int position=0;
		int position2=0;
		 int turn=0;
		 int roll=0;
		 int oldTurn=0;
		 while(position<100 && position2<100) {
			 if(turn==0)
				 System.out.println("Player 1 is playing");
			 else
				 System.out.println("Player 2 is playing");
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
			  else
				  position2+=dicenumber;
		     
			  if(position >100) {
				  position-=dicenumber;
				  System.out.println("Player exceeds 100");
			   }
			  if(position2 >100) {
				  position2-=dicenumber;
				  System.out.println("Player exceeds 100");
			  }
			    break;
		  case 2:
			  System.out.println("play Action : Snake");
			  if(turn!=0)
				  position-=dicenumber;
			  else
				  position2-=dicenumber;
			 
			  if(position <0)
			  {
				  position =Math.max(position, 0);
				  System.out.println("Player1 reset to 0");
			  }
			  if(position2 <0)
			  {
				  position2 =Math.max(position, 0);
				  System.out.println("Player2 reset to 0");
			  }
			  turn=(turn+1)%2;
			  break;
		  }
		  if(oldTurn==0)
			  System.out.println("Current position for player1 " +  position + "\n");
		  else
			  System.out.println("Current position for player2 " +  position + "\n");
		        roll++;
				oldTurn=turn;  
		  }
			System.out.println("Cogratulations Player" +(turn+1));	
			System.out.println("we took " + roll + " rolls to wine the game");
		 }
}
