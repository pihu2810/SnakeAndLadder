package Day3;

import java.util.Scanner;

public class SmallestElement {
	public static void main(String args[])
	 {
		 int small,n,i;
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the Value of n: ");
		 n=sc.nextInt();
		int arr[]=new int[n];
		
		  System.out.println("Enter " +n+ " Numbers: ");
		 for(i=0;i<n;i++)
			 arr[i]=sc.nextInt();
		 small=arr[0];
		 sc.close();
		 for(i=1;i<n;i++)
		 {
			 if(small>arr[i])
				 small=arr[i];
		 }
		 System.out.println("Smallest number = " +small);
	 }
}
