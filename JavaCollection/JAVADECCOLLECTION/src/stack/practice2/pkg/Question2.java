/*
7. Check Balanced Parentheses  
   - Question: Check if the parentheses in a string are balanced using a Stack.
   - Input: "(([]){})"
   - Output: true
 */

package stack.practice2.pkg;

import java.util.Stack;

public class Question2 
{
	public static boolean checkBalanced(String s1)
	{
		char[] c1 = s1.toCharArray();
		
		if(s1.isEmpty())
		{
			return false;
		}
		
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
				if((c1[i] == ')' && top != '(') || 
				   (c1[i] == ']' && top != '[') ||
				   (c1[i] == '}' && top != '{'))
				{
					return false;
				}
			}
		}
		
		return st.isEmpty();
	}
	
	public static void main(String[] args) 
	{
		String s1 = "(([]){})";
		boolean res = checkBalanced(s1);
		System.out.println(res);
	}
}
