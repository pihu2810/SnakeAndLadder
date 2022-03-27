package Day2;

import java.util.Scanner;

public class Ifelse2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n,u,t,h;
		 n=sc.nextInt();
		 sc.close();
		u=n%10;
		t=n%100/10;
		h=n%1000/100;
			 System.out.println("the number in unit place is "+u);
		 
			 System.out.println("the number in tens place is "+t); 
		 
			 System.out.println("the number in hundreds place is "+h); 
		}
	}


