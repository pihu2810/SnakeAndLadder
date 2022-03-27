package Day2;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args)
	{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value for x:");
     int x=sc.nextInt();
     System.out.println("Enter the value for y:");
     int y=sc.nextInt();
     sc.close();
         double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("Distance from (x,y) to (0,0) is :" + distance);

    }
}
