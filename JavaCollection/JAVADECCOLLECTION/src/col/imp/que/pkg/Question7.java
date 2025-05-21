/*
7. Check Balanced Parentheses  
   - Question: Check if the parentheses in a string are balanced using a Stack.
   - Input: "(([]){})"
   - Output: true
 */

package col.imp.que.pkg;

import java.util.Stack;

public class Question7
{
	public static boolean isBalanced(String s)
	{
		if(s.isEmpty())
		{
			return false;
		}
		
		char[] ch = s.toCharArray();
		Stack<Character> st = new Stack<Character>();
		
		for(int i = 0; i < ch.length; i++)
		{
			char c1 = ch[i];
			
			if(c1 == '(' || c1 == '[' || c1 == '{')
			{
				st.push(c1);
			}
			else
			{
				if(st.isEmpty())
				{
					return false;
				}
				
				char p1 = st.pop();
				
				if((c1 == ')' && p1 != '(') ||
				   (c1 == ']' && p1 != '[') ||
				   (c1 == '}' && p1 != '{'))
				{
					return false;
				}
			}
			
		}
		
		return true;
	}
	public static void main(String[] args)
	{
		String s = "(([]){})";
		boolean res = isBalanced(s);
		System.out.println("Is Balanced : "+res);
	}
}
