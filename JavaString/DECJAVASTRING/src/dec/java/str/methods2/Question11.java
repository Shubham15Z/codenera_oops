/*
 Write a program to check if a string ends with a given substring.
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question11 
{
	void checkSubString(String s1,String s2)
	{
		if(s1.endsWith(s2))
		{
			System.out.println("EndsWith : True");
		}
		else
		{
			System.out.println("EndsWith : False");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		System.out.println("Enter a substring :");
		String s2 = sc.nextLine();
		
		Question11 q11 = new Question11();
		q11.checkSubString(s1,s2);
	}
}
