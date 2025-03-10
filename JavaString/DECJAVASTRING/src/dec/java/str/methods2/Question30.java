/*
30. Write a program to check if a string contains only digits.
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question30 
{
	boolean checkOnlyDigit(String s1)
	{
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) < '0' || s1.charAt(i) > '9')
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = sc.nextLine();
		
		Question30 q30 = new Question30();
		boolean result = q30.checkOnlyDigit(s1);
		
		if(result)
		{
			System.out.println("It contains only digits...");
		}
		else
		{
			System.out.println("It does not contain only digits...");
		}
	}
}
