/*
 7. Check if Two Strings are Isomorphic
   Problem Description:  
   Write a Java program to check if two strings are isomorphic using a HashMap. 
   Two strings are isomorphic if the characters in one string can be replaced to get the other string.

   Input: Two strings.  
   Output: true or false.

   Example:
   - Input: "foo", "bar"
   - Output: false

   - Input: "egg", "add"
   - Output: true
 */

package hashmap.practice1.pkg;

import java.util.HashMap;

public class Question7 
{
	public static void main(String[] args) 
	{
		String s1 = "foo";
		String s2 = "bar";
		
		boolean b = true;
		
		HashMap<Character, Character> m1 = new HashMap<Character, Character>();
		
		for(int i = 0; i < s1.length(); i++)
		{
			if(!m1.containsKey(s1.charAt(i)))
			{
				m1.put(s1.charAt(i), s2.charAt(i));
			}
			else
			{
				Character ch = m1.get(s1.charAt(i));
				if(ch != s2.charAt(i))
				{
					b = false;
				}
			}
		}
		
		if(b == true)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
