/*
Q10. Good or Bad string (Amazon)
Input:
S = aeioup??
Output:
1
Explanation: The String doesn't contain more than
3 consonants or more than 5 vowels together. So,
it's a GOOD string.
 */

package string.practice.pkg;

import java.util.Arrays;

public class Question10 
{
	public static boolean isVowel(char ch)
	{
		return "aeiou".indexOf(ch) != -1;
	}
	public static int checkString(String s1)
	{
		int vowelCount = 0;
		int consonentCount = 0;
		
		for(int i = 0; i < s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if(ch == '?')
			{
				vowelCount++;
				consonentCount++;
			}
			else if(isVowel(ch))
			{
				vowelCount++;
				consonentCount = 0;
			}
			else
			{
				consonentCount++;
				vowelCount = 0;
			}
			
			if(vowelCount > 5 || consonentCount > 3)
			{	
				return 0;
			}
		}
		return 1;	
	}
	
	public static void main(String[] args)
	{
		String s = "aeioup??";
		int res = checkString(s);
		if(res == 1)
			System.out.println("GOOD");
		else
			System.out.println("BAD");
	}
}
