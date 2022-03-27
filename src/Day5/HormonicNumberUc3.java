package Day5;

import java.util.Scanner;

public class HormonicNumberUc3
{
	public static void main(String args[])
	{
      Scanner sc =new Scanner(System.in);
      System.out.print("Enter the value for N =");
	  int N=sc.nextInt();
	  float sum=0;
	  sc.close();
	  if(N>0) 
	  {
		 for(float i=1;i<=N;i++)
		 {
			 System.out.print(1+"/"+(int)i+"\t");
			float result =1/i;
			 
			System.out.println();
			 System.out.println("The result of HormonicNumber =" +1/i);
			 sum=sum+result;
			 
		 }
		 System.out.println("The sum of HormonicNumber =" +sum);
        } 
	  
     }
}