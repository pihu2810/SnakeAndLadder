package Day2;

import java.util.Scanner;

public class Ifelse {
	public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
       
       sc.close();
        String[] single_digits = new String[]{"zero","one","two","three","four","five", "six","seven","eight","nine"};
      
        if(n<=9)
        {
            System.out.println("single digit:"+single_digits[n]);
        }
        
        else
            System.out.println("Invalid input");
}
}