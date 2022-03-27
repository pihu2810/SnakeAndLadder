package Day6;

import java.util.Scanner;

public class StopWatchUc6 
{
	public static void main(String args[])
	 {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter 1 to start watch");
	   double StartWatch=sc.nextDouble();
	   StartWatch=System.currentTimeMillis();
	   System.out.println("Enter 0 to stop watch");
	   double StopWatch=sc.nextDouble();
	   StopWatch=System.currentTimeMillis();
	   sc.close();
	   double timeInsec=Math.abs((StartWatch - StopWatch)) / 1000;
	   System.out.println("Time in Sec = "+timeInsec);
	 }
}
