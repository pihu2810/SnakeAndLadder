package Day2;

import java.util.Scanner;

public class Operaters1 {
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the value for a: ");
        int a = in.nextInt();
        System.out.print("Enter the value for b: ");
        int b = in.nextInt();
        System.out.print("Enter the value for c: ");
        int c = in.nextInt();
        in.close();
        int x,y,z,w;
        w =a+b*c;
        x=c+a/b;
        y=a%b+c;
        z=a*b+c;
        System.out.println("The value of a+b*c = " +w);
        System.out.println("The value of c+a/b =" +x);
        System.out.println("The value of a%b+c =" +y);
        System.out.println("The value of a*b+c =" +z);
        
    }
}

