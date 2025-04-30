/*
5. Delete consecutive same words in a sequence

Input : ab aa aa bcd ab
Output : 3
As aa, aa destroys each other so, 
ab bcd ab is the new sequence.

Input :  tom jerry jerry tom
Output : 0

As first both jerry will destroy each other.
Then sequence will be tom, tom they will also destroy
each other. So, the final sequence doesn’t contain any
word.
 */

package stack.practice1.pkg;

import java.util.Arrays;
import java.util.Stack;

public class DeleteWord 
{
	public static int deleteSameWordInSequence(String s1)
	{
		String[] words = s1.split(" ");
		
		Stack<String> st = new Stack<String>();
		
		for(int i = 0; i < words.length; i++)
		{
			if(!st.isEmpty() && st.peek().equals(words[i]))
			{
				st.pop();
			}
			else
			{
				st.push(words[i]);
			}
		}
		return st.size();
	}
	
	public static void main(String[] args) 
	{
		String s1 = "ab aa aa bcd ab";
		String s2 = "tom jerry jerry tom";
		
		int result1 = deleteSameWordInSequence(s1);
		int result2 = deleteSameWordInSequence(s2);
		
		System.out.println(s1+" == "+result1);
		System.out.println(s2+" == "+result2);
	}
}
