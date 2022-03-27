package Day4;

public class SnakeLadderUC1_UC2 
{
  public static void main(String args [])
  {
	  System.out.println("Welcome to the Snake and Ladder Game");
	   int Dice_Starting_Range=1;
	   int Dice_Ending_Range=6;
	   int dicenumber = (int) (Math.floor(Math.random()*Dice_Ending_Range+Dice_Starting_Range));
	   System.out.println("The dice Value is =" +dicenumber);
  }
}
