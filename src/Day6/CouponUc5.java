package Day6;

import java.util.Scanner;

public class CouponUc5
{
	public static int getCoupon(int n) {
        return (int) (Math.random() * n);
	}
 public static void main(String args [])
 {
	 Scanner sc=new Scanner(System.in);
	  System.out.print("Enter a number =");
	  int n=sc.nextInt();
	  sc.close();
	  boolean[] isCollected = new boolean[n];
		 int distinct=0;
	  int count=0;
	  
	  while(distinct<n)
	  {
		  int value =getCoupon(n);
		  count++;
		  if(!isCollected[value]) {
			  distinct++;
			  isCollected[value] = true;
			
		  }
	  }
	  System.out.println("count is "+count);
	  
 }
}
