/*
2. Anagram Check
Input: `"listen", "silent"`

Output: true
 */

package com.string.practice.pkg;

import java.util.Arrays;

public class Question2 
{
	public static void main(String[] args)
	{
		String s1 = "listen";
		String s2 = "silent";
		
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		String res1 = new String(c1);
		String res2 = new String(c2);

		System.out.println(res1.equals(res2));
	}
}
