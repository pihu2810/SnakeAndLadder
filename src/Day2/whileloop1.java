package Day2;

import java.util.Scanner;

public class whileloop1 {
  public static void main(String args [])
  {
	  int i,j,sum=0;
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter sum from: ");
	  i=sc.nextInt();
	  System.out.println("Enter sum up to: ");
	  j=sc.nextInt();
	  sc.close();
	  while(i<=j)
	  {
		  sum=sum+i;
		  i++;
	  }
	  System.out.println("Sum of Natural Numbers=" +sum);
  }
}
