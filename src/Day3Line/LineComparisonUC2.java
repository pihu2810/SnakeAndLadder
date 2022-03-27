package Day3Line;

import java.util.Scanner;

public class LineComparisonUC2 {
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
		  System.out.println("Enter the value of X3 =");
		  double X3=sc.nextInt();
		  System.out.println("Enter the value of X4 =");
		  double X4=sc.nextInt();
		  System.out.println("Enter the value of Y3 =");
		  double Y3=sc.nextInt();
		  System.out.println("Enter the value of Y4 =");
		  double Y4=sc.nextInt();
		  double Length1=0,Length2=0;
		  sc.close();
		  Length1=Math.sqrt(Math.pow(X2-X1, 2)+(Math.pow(Y2-Y1, 2)));
		  System.out.println("The distance between two Lengths = "+Length1);
		  Length2=Math.sqrt(Math.pow(X4-X3, 2)+(Math.pow(Y4-Y3, 2)));
		  System.out.println("The distance between two Lengths = "+Length2);
		  if(Length1==Length2) 
		  {
			  System.out.println(" Two Lines are equal");
		  }else {
			  
			  System.out.println(" Two Lines are not equal");
			  
		  }
			  
	  }

}
