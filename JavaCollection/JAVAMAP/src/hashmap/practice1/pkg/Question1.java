/*
1. Find Duplicate Characters in a String
   Problem Description:  
   Write a Java program to find and print all duplicate characters in a given string using a HashMap.

   Input: A string.  
   Output: A list of duplicate characters.

   Example:
   - Input: "programming"
   - Output: g, r
 */

package hashmap.practice1.pkg;

import java.util.HashMap;
import java.util.Map;

public class Question1 
{
	public static void findDuplicateCharacter(String s)
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
			if(m1.get(ch) > 1)
			{
				System.out.print(ch+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		String s1 = "programming";
		findDuplicateCharacter(s1);
	}
}
