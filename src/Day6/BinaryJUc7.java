package Day6;

import java.util.Scanner;

import javax.swing.text.Utilities;

public class BinaryJUc7
{
	public static void shoArr(int[] arr)

	 {
		 for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		 }
		 System.out.println();
		 }

	static boolean powerof2(int n) {
		int i=0,temp=(int)Math.pow(2,i);
		while(temp<n) {
			if(temp==n) {
				return true;
			}
			i++;
		}
		return false;
		
		}
	static int[] swapNibbles(int[] arr)
	{
		int temp,j=arr.length-4;
		for(int i=0;i<4;i++)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			j++;
		}
		return arr;
	}
	
		 public static void main(String[] args)
		 {
			 Scanner sc=new Scanner(System.in);
			 System.out.print("Enter the Decimal number=" );
			 int [] binary=sc.Utilities.toBinary(Utilities.sc.nectInt());
			 sc.close();
		     System.out.print("Binary number=");
			 showArr(binary);
			 swapNibbles(binary);
			 System.out.println("After Swapping");
			 int swapDec=toDecimal(n);
			 System.out.println("Decimale of swapped binary = "+swapDec);
			 if(powerof2(swapDec))
				 System.out.println("its poewer of 2");
			 else
				 System.out.println("Not power of 2");
		 System.out.println("enter input as integer");
		  }
		
}

