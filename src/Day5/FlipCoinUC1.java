package Day5;

import java.util.Scanner;

public class FlipCoinUC1
{
 public static void main(String args[])
 {
	 float PercentHead=0,PercentTail=0,HeadCount=0,TailCount=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter number of times to Flip Coin =");
	 int num=sc.nextInt();
	 sc.close();
	 if(num>0)
	 {
		 for(int i=0;i<num;i++)
		 {
			 double Coin = Math.floor(Math.random() * 10)%2;
			 System.out.println(Coin);
			 if(Coin<0.5) 
				 HeadCount++;
			 else
				 TailCount++;
				 
		 }
		 PercentHead=(HeadCount/num)*100;
		 PercentTail=(TailCount/num)*100;
		 System.out.println("Percentage of Head =" +PercentHead);
		 System.out.println("Percentage of Tail=" +PercentTail);
	 }
	 else
		 System.out.println("Enter positive number only");
 }
}
  
 

