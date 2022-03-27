package Day6;

import java.util.Scanner;

public class SquareRootJUc5
{
 public static void main(String args[])
 {
	 System.out.println("Enter the number whose square root to be found =");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		sc.close();
		double epsilon = 1e-15;    
        double t = c;              
        while (Math.abs(t - c/t) > epsilon*t)
        {
         t = (c/t + t) / 2.0;
        }
     
         System.out.println("square root is "+t);
		
		
 }
}

