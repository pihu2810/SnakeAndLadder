package Day6;

import java.util.Scanner;

public class DayofWeekJUc2
{
  public static void main(String args[])
  {
	 

		     Scanner scanner = new Scanner(System.in);

		     boolean keepGoing = true;

		     while(keepGoing) {
		       System.out.println("Month");
		       int m = scanner.nextInt();
		         if (m < 1 || m > 12) {
		           System.out.println("Months are between 1 and 12");
		           continue;
		         }

		       System.out.println("Day");
		       int d = scanner.nextInt();
		         if (d < 1 || d > 31) {
		            System.out.println("Days are between 1 and 31");
		            continue;
		         }

		       System.out.println("Year");
		       int y = scanner.nextInt();
		       
		         if (y < -10000 || y > 10000) {
		            System.out.println("Years are between -10000 and 10000");
		            continue;
		         }

		        int y0 = y - (14 - m) / 12;
		        int x = y0 + y0/4 - y0/100 +y0/400;
		        int m0 = m + 12 * ((14 - m) / 12) - 2;
		        int d0 = (d + x + 31 * m0 / 12) % 7;  
		        System.out.println("day is " + (int) d0);

		    	switch ((int) d0) {
		    	case 0 -> System.out.println("sunday");
		    	case 1 -> System.out.println("monday");
		    	case 2 -> System.out.println("tuesday");
		    	case 3 -> System.out.println("wednesday");
		    	case 4 -> System.out.println("thursday");
		    	case 5 -> System.out.println("friday");
		    	case 6 -> System.out.println("saturday");
		    	default -> System.out.println("invalid day or answer");

		    	}

  }
  }
}
