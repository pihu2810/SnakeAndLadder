package Day1;

import java.util.Scanner;

public class Stringsequal {
	public static void main(String argd[])
	{
		 String str1, str2;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter first String:");
		str1=sc.nextLine();
		 System.out.println("Enter first String:");
		 str2=sc.nextLine();
		 sc.close();
		 if(str1.equals(str2))
			 System.out.println("Strings are Equal");	
		 else
		     System.out.println("Strings are Not Equal");
	}

}
