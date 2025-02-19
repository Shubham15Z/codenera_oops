/*
12. Write a method to check whether a character is an alphabet or not.
 */

package assignment.returntype.method.pkg;

import java.util.Scanner;

public class Question12 {
	String checkCharacter(char ch)
	{
		if((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
		{
			return "It is an alphabet";
		}
		else
		{
			return "It's not an alphabet";
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Question12 ob = new Question12();
		
		System.out.println("Enter a character :");
		char ch = sc.next().charAt(0);
		
		String result = ob.checkCharacter(ch);
		System.out.println(result);
		
	}
}
