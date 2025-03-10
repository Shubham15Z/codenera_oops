/*
Write a program to check if a string starts with a given substring.
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question10 
{
	void checkSubString(String s1,String s2)
	{
		if(s1.startsWith(s2))
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
		
		Question10 q10 = new Question10();
		q10.checkSubString(s1,s2);
	}
}
