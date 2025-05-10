/*
Q6. Remove common characters and concatenate (Oracle)
Input:
s1 = aacdb
s2 = gafd
Output: cbgf
Explanation: The common characters of s1
and s2 are: a, d. The uncommon characters
of s1 and s2 are c, b, g and f. Thus the
modified string with uncommon characters
concatenated is cbgf.
 */

package string.practice.pkg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Question6 
{
	public static void removeCommonCharacter(String s1, String s2)
	{
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		
		List<Character> list1 = new ArrayList<Character>();
		for(char ch : ch1)
		{
			list1.add(ch);
		}
		
		List<Character> list2 = new ArrayList<Character>();
		for(char ch : ch2)
		{
			list2.add(ch);
		}
		
		Set<Character> common = new HashSet<>(list1);
	    common.retainAll(list2);
		
		for(char ch : list1)
		{
			if(!common.contains(ch))
			{
				sb.append(ch);
			}
		}
		
		for(char ch : list2)
		{
			if(!common.contains(ch))
			{
				sb.append(ch);
			}
		}
		System.out.println(sb);	
	}
	
	public static void main(String[] args) 
	{
		String s1 = "aacdb";
		String s2 = "gafd";
		
		removeCommonCharacter(s1, s2);
	}
}
