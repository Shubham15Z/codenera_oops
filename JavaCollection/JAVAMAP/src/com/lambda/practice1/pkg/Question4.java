/*
Write a lambda function to extract the last character of a string.
 */

package com.lambda.practice1.pkg;

interface LastChar
{
	char findLast(String s1);
}
public class Question4 
{
	public static void main(String[] args) 
	{
		String input = "June";
		
		LastChar lastchar = (s) -> s.charAt(s.length()-1);
		
		char last = lastchar.findLast(input);
		
		System.out.println(last);
	}
}
