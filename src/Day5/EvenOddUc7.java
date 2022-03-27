package Day5;

import java.util.Scanner;

public class EvenOddUc7 
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter a number n=");
	 int n=sc.nextInt();
	 sc.close();
	 if(n%2==0) 
	 {
		 System.out.println("It is a Even Number");
	 } 
	   else
		   System.out.println("It is a Odd Number");   
  
	}

}
