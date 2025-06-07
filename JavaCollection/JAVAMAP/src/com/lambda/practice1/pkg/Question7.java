/*
Write a lambda expression to capitalize the first letter of a string.
 */

package com.lambda.practice1.pkg;

interface CapitalFirst
{
	String ConverToUpperCase(String s);
}
public class Question7
{
	public static void main(String[] args) 
	{
		String input = "Hello how are you?";
		
		CapitalFirst makeCapital = (s1) -> {
			String[] words = s1.split(" ");
			StringBuilder sb = new StringBuilder();
			for(String word : words)
			{
				char c1 = word.charAt(0);
				sb.append(Character.toUpperCase(c1)).append(word.substring(1)).append(" ");
			}
			
			return sb.toString();
		};
		
		String res = makeCapital.ConverToUpperCase(input);
		
		System.out.println(res);
	}
}
