/*
Q2.Wap enter a string and find the count of word and character(excluding space).
 */

package dec.java.str.method.assign02.pkg;

import java.util.Scanner;

public class Question2 
{
	void countWordsandCharacters(String s1)
	{
		int wordCount = 1, charCount = 0;
		
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) == ' ')
			{
				wordCount++;
			}
		}
		System.out.println("Word count is : "+wordCount);
		
		
		
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) == ' ')
			{
				continue;
			}
			charCount++;
		}
		System.out.println("Character count is : "+charCount);
	}
	
	void count2(String s1)
	{
		int charCount = 0;
		
		String[] words = s1.trim().split("\\s+");
		int countWords = words.length;
		System.out.println("Word count is : "+countWords);
		
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) != ' ')
				charCount++;
		}
		System.out.println("Character count is : "+charCount);
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String : ");
		
		String s1 = sc.nextLine();
		
		Question2 q2 = new Question2();
//		q2.countWordsandCharacters(s1);
		q2.count2(s1);
		
	}
}
