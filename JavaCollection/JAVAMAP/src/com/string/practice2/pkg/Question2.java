/*
2. Java program to copy one string to another string.  
 */

package com.string.practice2.pkg;

public class Question2 
{
	public static void main(String[] args)
	{
		String s1 = "hello";
		
		String s2 = "";
		
		for(char ch : s1.toCharArray())
		{
			s2+= ch;
		}
		
		System.out.println(s2);
	}
}
