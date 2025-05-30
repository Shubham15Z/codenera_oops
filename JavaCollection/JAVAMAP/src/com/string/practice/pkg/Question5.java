/*
5. String Compression
Input: "aaabbccc"
Output: "a3b2c3"
 */

package com.string.practice.pkg;

public class Question5
{
	public static void main(String[] args) 
	{
		String s = "aaabbccc";
		
		StringBuilder res = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++)
		{
			int count = 1;
			
			while(i + 1 < s.length() && s.charAt(i) == s.charAt(i+1))
			{
				count++;
				i++;
			}
			
			res.append(s.charAt(i)).append(count);
		}
		
		System.out.println(res.toString());
	}
}
