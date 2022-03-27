package Day3Line;

import java.util.Scanner;

public class LineComparisonUC1 {

	 public static void main(String args[])
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the value of X1 =");
		  double X1=sc.nextInt();
		  System.out.println("Enter the value of X2 =");
		  double X2=sc.nextInt();
		  System.out.println("Enter the value of Y1 =");
		  double Y1=sc.nextInt();
		  System.out.println("Enter the value of Y2 =");
		  double Y2=sc.nextInt();
		  double Distance=0;
		  sc.close();
		  Distance=Math.sqrt(Math.pow(X2-X1, 2)+(Math.pow(Y2-Y1, 2)));
		  System.out.println("The distance between two Lengths = "+Distance);
	  }
}
