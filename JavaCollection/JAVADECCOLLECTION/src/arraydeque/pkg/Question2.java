/*
 2. Palindrome Check
   Write a program to check if a given string is a palindrome using ArrayDeque. 
   Use the deque to compare characters from the front and back.
 */

package arraydeque.pkg;

import java.util.ArrayDeque;
import java.util.Arrays;

public class Question2 
{
	public static void main(String[] args) 
	{
		String s1 = "madam";
		
		ArrayDeque<Character> q1 = new ArrayDeque<Character>();
		
		for(char ch : s1.toCharArray())
		{
			q1.add(ch);
		}
		
		boolean isPalindrome = true;
		
		while(q1.size() > 1)
		{
			if(!q1.pollFirst().equals(q1.pollLast()))
			{
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome)
		{
			System.out.println(s1+" is palindrome");
		}
		else
		{
			System.out.println(s1+" is not palindrome");
		}
		
	}
}
