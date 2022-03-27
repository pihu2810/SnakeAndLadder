package Day5;

import java.util.Scanner;

public class Powerof2UC2 
{
 public static void main(String args[])
  {
	 Scanner sc=new Scanner (System.in);
	 System.out.print("Enter a the Power value for N=");
	 int N=sc.nextInt();
	 sc.close();
	 int i=1;
	 if(N !=0 || N< 31) 
	 {
		 System.out.println("Integer overflow");
		 System.exit(N);
	 }
	   else
	       while(i<=N && i<31) 
	       {
	         i = (int) Math.pow(2, N);
	         System.out.println("The Power of 2 =" +i);
	         i++;
	         break;
	        }
	
   }
}