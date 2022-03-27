package Day5;

import java.util.Scanner;

public class PrimeFactorsUc4 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value for N = ");
		int N=sc.nextInt();
		sc.close();
	    int	temp;
		temp=N;
		if(N>0)
		{
			for(int i=2;i<Math.sqrt(N);i++)
			{
				while(temp%i==0)
				{
					System.out.println("Prime Factors of a given number are =" +i);
					temp=temp/i;
			    }
		    }
		
	    }else
		System.out.println("Enter valid number");
	}
}
