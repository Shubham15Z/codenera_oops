/*
 4. Balanced Parentheses
   Write a program that checks whether a string of parentheses (i.e., (), {}, []) is balanced using ArrayDeque.
 */

package arraydeque.pkg;

import java.util.ArrayDeque;

public class Question4 
{
	public static boolean checkBalanced(String s)
	{
		if(s.isEmpty())
		{
			return false;
		}
		
		ArrayDeque<Character> q1 = new ArrayDeque<Character>();
		
		for(char ch : s.toCharArray())
		{
			if(ch == '(' || ch == '[' || ch == '{')
			{
				q1.push(ch);
			}
			else
			{
				if(q1.isEmpty())
					return false;
				
				char top = q1.pop();
				if((ch == ')' && top != '(') ||
				   (ch == ']' && top != '[') ||
				   (ch == '}' && top != '{')) 
				{
					return false;
				}
			}
		}
		
		return q1.isEmpty();
	}
	
	public static void main(String[] args)
	{
		String s1 = "[{()}]";
		String s2 = "[()()]{}";
		String s3 = "()[]{}";
		String s4 = "([{]}))";
		
		boolean result1 = checkBalanced(s1);
		boolean result2 = checkBalanced(s2);
		boolean result3 = checkBalanced(s3);
		boolean result4 = checkBalanced(s4);
		
		System.out.println(s1+"       "+result1);
		System.out.println(s2+"       "+result2);
		System.out.println(s3+"       "+result3);
		System.out.println(s4+"       "+result4);
	}
}
