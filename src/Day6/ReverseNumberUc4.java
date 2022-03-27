package Day6;

import java.util.Scanner;

public class ReverseNumberUc4 
{
	 public static void main(String args[])
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter a number =");
		  int n=sc.nextInt();
		  sc.close();
		  int reverse=0;
		  while(n!=0)
		  {
			 int reminder= n%10;
			 reverse=reverse*10+reminder;
			 n=n/10;
		  }
		  System.out.println("The reverse of given number is:" +reverse);
		  
	  }
}
