/*
Create a lambda function to check if a given string is pallindrome or not
 */
package com.lambda.practice1.pkg;

interface PalindromeCheck
{
	boolean isPalindrome(String s);
}

public class Question10
{
	public static void main(String[] args) 
	{
		String input = "madam";
		
		PalindromeCheck pal = (s) -> {
			
			StringBuilder sb = new StringBuilder(s);
			String rev = sb.reverse().toString();
			
			return rev.equals(s);
		};
		
		if(pal.isPalindrome(input))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}
