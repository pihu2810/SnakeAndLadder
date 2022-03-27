package Day2;

import java.util.Scanner;

public class whileloop2 {
	public static void main(String args [])
	  {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Intger:");
			int input=sc.nextInt();
	int reversed=0;
	sc.close();
	System.out.println("Enter Original Number:");

    
	while(input!=0) 
	{
		int digit=input%10;
		reversed =reversed*10+digit;
		input/=10;
	}
	System.out.println("Reversed Number:" + reversed);
		
	}
}
	

