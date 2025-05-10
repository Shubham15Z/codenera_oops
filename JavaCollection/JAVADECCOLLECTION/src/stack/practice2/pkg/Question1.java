/*
6. Reverse a String  
   - Question: Use a Stack to reverse a string.
   - Input: "hello"
   - Output: "olleh"
 */

package stack.practice2.pkg;

import java.util.Stack;

public class Question1 
{
	public static void main(String[] args)
	{
		String input = "hello";
		char[] c1 = input.toCharArray();
		Stack<Character> st = new Stack<Character>();
		
		for(char ch : c1)
		{
			st.push(ch);
		}
		
		String s2 = "";
		
		while(!st.isEmpty())
		{
			s2 = s2+st.pop();
		}
		
		System.out.println(s2);
	}
}
