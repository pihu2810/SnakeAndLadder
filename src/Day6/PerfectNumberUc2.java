package Day6;

import java.util.Scanner;

public class PerfectNumberUc2 
{
	public static void main(String args[])
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter a number = " );
		 int n=sc.nextInt();
		 sc.close();
		 int sum=0;
		 for(int i=1;i<=n/2;i++)
		 {
			 if(n%i==0)
			 {
				 sum=sum+i;
			 }
		 }
		 System.out.println(n);
		 if(sum==n)
		    {
			 System.out.println("Perfect number");
			 }
		 else
			 System.out.println("Not Perfect number");
		 
			
	 }
		 
}
