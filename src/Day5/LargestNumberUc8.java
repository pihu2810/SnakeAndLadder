package Day5;

import java.util.Scanner;

public class LargestNumberUc8 
{
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number1 = ");
		int num1=sc.nextInt();
		System.out.print("Enter a number2 = ");
		int num2=sc.nextInt();
		System.out.print("Enter a number3 = ");
		int num3=sc.nextInt();
		sc.close();
		if(num1>num2 && num1>num3)
			System.out.println("Largest number is "+num1);
		if(num2>num1 && num2>num3)
			System.out.println("Largest number is "+num2);
		if(num3>num1 && num3>num2)
			System.out.println("Largest number is "+num3);
		
			
		
			
		
	}

}
