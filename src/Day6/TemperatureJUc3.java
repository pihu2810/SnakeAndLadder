package Day6;

import java.util.Scanner;

public class TemperatureJUc3 
{
 public static void main(String args[])
 {
	 double fahrenheit;
	 double celsious = 0;
	 Scanner scanner = new Scanner(System.in);
	 int selection = scanner.nextInt();
	 fahrenheit=((celsious * 9/5) + 32);
	 celsious =((fahrenheit * 9/5) + 32);
	 switch (selection) {
	    case 1:
		System.out.println("Enter the fahrenheit value to convert to celsious");
		 fahrenheit = scanner.nextInt();
		 
		 System.out.println("fahreheit to celsious=" +celsious);
		break;
	    case 2:
		System.out.println("Enter the celsious value to convert to fahrenheit");
		celsious = scanner.nextInt();
		 
		 System.out.println("celsious to fahreheit=" +fahrenheit);
		break;
	    default:
		System.out.println("invalid input");
		break;
	    }
	 
 }	    
		    
 }

