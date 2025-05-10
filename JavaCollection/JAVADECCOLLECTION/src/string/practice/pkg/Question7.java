/*
Q7. Print first letter of every word in the string (Zoho)
Input:
S = "geeks for geeks"
Output: gfg
 */


package string.practice.pkg;

import java.util.Arrays;

public class Question7 
{
	public static void main(String[] args) 
	{
		String sentence = "geeks for geeks";
		
		String[] words = sentence.split("\\s");
		
		System.out.println(Arrays.toString(words));
		
		for(String word : words)
		{
			System.out.print(word.charAt(0));
		}
	}
}
