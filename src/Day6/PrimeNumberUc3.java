package Day6;

import java.util.Scanner;

public class PrimeNumberUc3 
{
	public static void main(String args[])
	 {
		 boolean isprime=true;
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter a number = " );
		 int n=sc.nextInt();
		 sc.close();
		 if(n!=0 || n!=1)	 { 
			 for(int i=2;i<=n/2;i++) {
				
				 if(n%i==0)
				 {
					
					 isprime=false;
					 
					 break;
					 }
				 } if(isprime) 
				 System.out.println("Is a prime");
				 else
					 System.out.println("Is  not prime");
			 }
		 else
			 System.out.println("Enter valid number");
		 }
}
