package Day2;

import java.util.Scanner;

public class SwitchVowel {
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		char ch;
		sc= new Scanner(System.in);

		System.out.print(" Enter any Character: ");
		ch = sc.next().charAt(0);
		sc.close();
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch <= 'o' || ch == 'u' ||
				ch == 'A' || ch == 'E' || ch == 'I' || ch <= 'O' || ch == 'U') 
		{
			System.out.println("It is Vowel:" +ch);
		}
		else 
		{
			System.out.println("It is Consonant:" +ch);
		}
	}
}
