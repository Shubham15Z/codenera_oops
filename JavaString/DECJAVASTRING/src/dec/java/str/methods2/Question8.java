/*
 8. Write a program to count the number of consonants in a string.
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question8 
{
	public int countConsonants(String s1)
	{
		String s2 = "aeiouAEIOU";
		
		int consonent = 0;
		
		for(int i = 0; i < s1.length(); i++)
		{
			int count = 0;
			for(int j = 0; j < s2.length(); j++)
			{
				if(s1.charAt(i) == s2.charAt(j))
				{
					count++;
				}
			}
			if(count == 0)
			{
				consonent++;
			}
		}
		
		return consonent;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		
		Question8 q8 = new Question8();
		int result = q8.countConsonants(s1);
		System.out.println("Count of Consonant is : "+result);
	}
}
