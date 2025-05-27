/*
11. Implement a Java function to check if a given string is a palindrome using recursion.
 */

package sz.recursion.pkg;

import java.util.Scanner;

public class Question11 
{
	public static boolean checkPalindrome(String s)
	{
		if(s.length() <= 1)
		{
			return true;
		}
		
		if(s.charAt(0) != s.charAt(s.length()-1))
		{
			return false;
		}
		
		return checkPalindrome(s.substring(1, s.length()-1));
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string ");
		
		String s = sc.nextLine();
		
		boolean res = checkPalindrome(s);
		System.out.println(res);
	}
}
