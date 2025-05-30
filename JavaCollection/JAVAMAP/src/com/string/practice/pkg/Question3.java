/*
3. Palindrome Check
Input: "madam"
Output: true
 */

package com.string.practice.pkg;

public class Question3 
{
	public static void main(String[] args) 
	{
		String s1 = "madam";
		
		String res = "";
		
		for(int i = s1.length()-1; i >= 0; i--)
		{
			res+=s1.charAt(i);
		}
		
		System.out.println(res.equals(s1));
	}
}
