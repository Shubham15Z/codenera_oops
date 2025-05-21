/*
6. Reverse a String  
   - Question: Use a Stack to reverse a string.
   - Input: "hello"
   - Output: "olleh"
 */

package col.imp.que.pkg;

import java.util.Stack;

public class Question6 
{
	public static void main(String[] args) 
	{
		String s = "hello";
		
		Stack<Character> st = new Stack<Character>();
		
		for(char ch : s.toCharArray())
		{
			st.push(ch);
		}
		
		StringBuilder reverse = new StringBuilder();
		
		while(!st.isEmpty())
		{
			reverse.append(st.pop());
		}
		
		System.out.println("Reverse : "+reverse.toString());
	}
}
