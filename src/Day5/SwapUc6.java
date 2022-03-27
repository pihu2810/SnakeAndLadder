package Day5;

import java.util.Scanner;

public class SwapUc6 
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Before swaping numbers ");
	  System.out.print("Enter a num1 = ");
	  int num1=sc.nextInt();
	  System.out.print("Enter a num2 = ");
	  int num2=sc.nextInt();
	  sc.close();
	  
	  int temp;
	  temp=num1;
	  num1=num2;
	  num2=temp;
	  System.out.println("After swaping numbers ");
	  System.out.println("num1 = " +num1);
	  System.out.println("num2 = " +num2);
	  
  }
}
