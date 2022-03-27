package Day1;

import java.util.Scanner;

public class Leapyear
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Check Leap Year, Century Year or Not");
		System.out.println("-------------------------------------");
		System.out.println("please enter the year greater than 1582");
		System.out.print("Enter year: ");
		int year = sc.nextInt();
		if(year<=1582) {
			System.out.println("Invalid Input : Please enter year greater than 1582");
			System.exit(0);
		} 
			
		if (year % 100 == 0){
			if(year % 400 == 0){
				System.out.println("Year '"+year+"' is  a Century Year and a Leap Year!");
			} else {
				System.out.println("Year '"+year+"' is  Century Year and a not Leap Year!");
			}
		} else {
			if(year % 4 == 0){
				System.out.println("Year '"+year+"' is a Leap Year!");
			} else {
				System.out.println("Year '"+year+"' is not a Leap Year!");
			}
		} 
				
			}
		
}
