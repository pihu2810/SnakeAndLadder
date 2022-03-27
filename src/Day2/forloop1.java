package Day2;

import java.util.Scanner;

public class forloop1 {
	public static void main(String args [])
	  {
		  int i,j=0,sum=0;
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter sum from: ");
		  i=sc.nextInt();
		  System.out.println("Enter sum up to: ");
		  j=sc.nextInt();
		  sc.close();
		   for(i=1;i<=j;++i)
		  {
			  sum=sum+i;
			 
		  }
		  System.out.println("Sum of Natural Numbers=" +sum);
	  }

}
