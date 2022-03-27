package Day5;

import java.util.Scanner;

public class QuotientReminderUc5 
{
	public static void main(String args[]) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number1=");
		float num1=sc.nextFloat();
		System.out.print("Enter a number2=");
		float num2=sc.nextFloat();
		sc.close();
		float reminder,quotient;
		reminder=num1%num2;
		quotient=num1/num2;
		System.out.println("Reminder = " +reminder);
		System.out.println("Quotient = " +quotient);
		
	}
}
