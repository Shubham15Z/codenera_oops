/*
 12. Write a program to check if a string contains a specific character.
 */
package dec.java.str.methods2;

import java.util.Scanner;

public class Question12 
{
	void checkChar(String s1,String s2)
	{
		if(s1.contains(s2))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		System.out.println("Enter a substring :");
		String s2 = sc.nextLine();
		
		Question12 q12 = new Question12();
		q12.checkChar(s1,s2);
	}
}
