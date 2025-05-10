/*
3. Find the First Non-Repeating Character in a String
   Problem Description:  
   Write a Java program to find the first non-repeating character in a string using HashMap.

   Input: A string.  
   Output: The first non-repeating character, or null if all repeat.

   Example:
   - Input: "swiss"
   - Output: 'w'
 */

package hashmap.practice1.pkg;

import java.util.HashMap;
import java.util.Map;

public class Question3 
{
	public static void findFirsNonRepeatingCharacter(String s)
	{
		char[] c1 = s.toCharArray();
		
		Map<Character, Integer> m1 = new HashMap<Character, Integer>();
		
		for(char ch : c1)
		{
			if(m1.containsKey(ch))
			{
				m1.put(ch, m1.get(ch)+1);
			}
			else
			{
				m1.put(ch, 1);
			}
		}
		
		for(char ch : m1.keySet())
		{
			if(m1.get(ch) <= 1)
			{
				System.out.print(ch);
				return;
			}
		}
		System.out.println("null");
	}
	public static void main(String[] args) 
	{
		String s1 = "swiss";
		findFirsNonRepeatingCharacter(s1);
	}
}
