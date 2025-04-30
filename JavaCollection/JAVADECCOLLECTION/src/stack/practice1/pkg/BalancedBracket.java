/*
Given a string s representing an expression containing various types of brackets: {}, (), and [], 
the task is to determine whether the brackets in the expression are balanced or not. 
A balanced expression is one where every opening bracket has a corresponding closing bracket in the correct order.

Example: 

Input: s = “[{()}]”
Output: true
Explanation:  All the brackets are well-formed.


Input: s = “[()()]{}”
Output: true
Explanation: All the brackets are well-formed.


Input: s = “([]”
Output: false
Explanation: The expression is not balanced as there is a missing ‘)’ at the end.


Input:  s = “([{]})”
Output: false
Explanation: The expression is not balanced because there is a closing ‘]’ before the closing ‘}’.
 */

package stack.practice1.pkg;

import java.util.Stack;

public class BalancedBracket 
{
	public static boolean checkBalanced(String s)
	{
		if(s.length() == 0 || s.length() % 2 !=0)
		{
			return false;
		}
		
		char[] c1 = s.toCharArray();
		Stack<Character> st = new Stack<Character>();
		
		for(int i = 0; i < c1.length; i++)
		{
			if(c1[i] == '(' || c1[i] == '[' || c1[i] == '{')
			{
				st.push(c1[i]);
			}
			else
			{
				if(st.isEmpty())
					return false;
				
				char top = st.pop();
				if((c1[i] == ')' && top != '(') || (c1[i] == ']' && top != '[') || (c1[i] == '}' && top != '{'))
				{
					return false;
				}
				
			}
		}
		return true;
	}
	public static void main(String[] args) 
	{
		String s1 = "[{()}]";
		String s2 = "[()()]{}";
		String s3 = "()[]{}";
		String s4 = "([{]})";
		
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


































