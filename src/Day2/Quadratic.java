package Day2;

import java.util.Scanner; 

public class Quadratic {
	
	static void calculateRoots(int a, int b, int c)  
 {  
	
	if (a == 0)   
	{  
	System.out.println("The value of a cannot be 0.");  
	return;  
	}  
	 
	int d = b * b - 4 * a * c;  
	double sqrtval = sqrt(abs(d));  
	if (d > 0)   
	{  
	System.out.println("The roots of the equation are real and different. \n");  
	System.out.println((double)(-b + sqrtval) / (2 * a) + "\n"+ (double)(-b - sqrtval) / (2 * a));  
	}  
	else if (d == 0)   
	{  
	System.out.println("The roots of the equation are real and same. \n");  
	System.out.println(-(double)b / (2 * a) + "\n"+ -(double)b / (2 * a));  
	}  
	
	else   
	{  
	System.out.println("The roots of the equation are complex and different. \n");  
	System.out.println(-(double)b / (2 * a) + " + i"+ sqrtval + "\n"+ -(double)b / (2 * a)+ " - i" + sqrtval);  
	}  
	}  
	private static double sqrt(Object abs) {
		return 0;
	}
	
	private static Object abs(int d) {
		
		return null;
	}
	 
	public static void main(String args[])  
	{  
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a value for a:");
	int a=sc.nextInt();
	System.out.println("Enter a value for b:");
	int b=sc.nextInt();
	System.out.println("Enter a value for c:");
	int c=sc.nextInt();
	sc.close();
	calculateRoots(a, b, c);  
	 }
}