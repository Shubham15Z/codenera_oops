/*
6. First Non-Repeated Character in a String
   Write a program to find the first non-repeated character in a string using a LinkedHashSet. 
   Iterate through the string, store characters in the set, and remove duplicates.
 */

package linkedhashset.practice1.pkg;

import java.util.LinkedHashSet;
import java.util.Set;

public class Question6 
{
	
	public static void main(String[] args)
	{
		String s1 = "management";
		
		Set<Character> once = new LinkedHashSet<Character>();
		Set<Character> duplicate = new LinkedHashSet<Character>();
		
		for(char ch : s1.toCharArray())
		{
			if(duplicate.contains(ch))
				continue;
			else if(once.contains(ch))
			{
				once.remove(ch);
				duplicate.add(ch);
			}	
			else
				once.add(ch);
		}
		
		for(char ch : once)
		{
			System.out.println(ch);
			return;
		}
	}
}
