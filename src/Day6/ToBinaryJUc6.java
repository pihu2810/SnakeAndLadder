package Day6;

import java.util.Scanner;

public class ToBinaryJUc6 
{
 public static void toBinary(int n)

 {
	 int [] binaryNum=new int[1000];
	 
	 int i=0;
	 while(n>0)
	 {
		 binaryNum[i]=n%2;
		 n=n/2;
		 i++;
	 }
	 for(int j=i-1;j>=0;j--) 
		 System.out.print(binaryNum[j]);
	 }
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the Decimal number=" );
		 int n=sc.nextInt();
		 sc.close();
	     System.out.print("Binary number=");
		 toBinary(n);
	 }
	
}
 