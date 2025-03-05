/*
 * 5.enter a string and count the no of vowel and consonent.
 */

package dec.java.str.methods;

import java.util.Scanner;

public class Question5
{
	
	void countVowelAndConsonent(String s1)
	{
		int vovelCount = 0, consonentCount = 0;
		
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o' || s1.charAt(i) == 'u')
			{
				vovelCount++;
			}
			else if(s1.charAt(i) == ' ')
			{
				continue;
			}
			else
			{
				consonentCount++;
			}
		}
		
		System.out.println("Vovel Count is : "+vovelCount);
		System.out.println("Consonent Count is : "+consonentCount);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		
		Question5 q5 = new Question5();
		q5.countVowelAndConsonent(s1);
	}
}
