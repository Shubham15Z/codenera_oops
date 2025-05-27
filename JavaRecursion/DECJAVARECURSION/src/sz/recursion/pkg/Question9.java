/*
9. How do you reverse a string using recursion in Java?
 */

package sz.recursion.pkg;

import java.util.Scanner;

public class Question9 
{
	public static String reverseString(String s)
	{
		if(s.length() > 0)
		{
			return reverseString(s.substring(1)) + s.charAt(0);
		}
		else
		{
			return s;
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		
		String s1 = sc.nextLine();
		
		String res = Question9.reverseString(s1);
		System.out.println(res);
	}
}
