package Day6;

import java.util.Scanner;

public class MonthlyPaymentJUc4 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the principle loan amount =");
		float P=sc.nextFloat();
		System.out.print("Enter the persent interst =");
		float Y=sc.nextFloat();
		System.out.print("Enter the yeaers to pay the lone =");
		float R=sc.nextFloat();
		sc.close();
		float n=12*Y;
		float r=R/(12*100);
		float totalpayment=(float)((P*r)/(1-Math.pow((1+r),(-n))));
		System.out.println("Total monthly payment =" +totalpayment);
	}

}
