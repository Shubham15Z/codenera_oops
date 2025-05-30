/*
1. Reverse a String
Input: "Hello World"
Output: "World Hello"
 */

package com.string.practice.pkg;

import java.util.Arrays;

public class Question1 
{
	public static void main(String[] args)
	{
		String s = "Hello World";
		
		String[] words = s.split(" ");
		
		System.out.println(Arrays.toString(words));
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = words.length-1; i >= 0; i--)
		{
			sb.append(words[i]+" ");
		}
		
		String res = sb.toString();
		System.out.println(res);
	}
}
