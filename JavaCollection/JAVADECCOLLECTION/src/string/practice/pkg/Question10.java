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
	public static void checkString(String s)
	{
		String s1 = s.replaceAll("[^a-zA-Z]", "");
		String vowel = "aeiou";
		int vowelCount = 0;
		int consonentCount = 0;
		
		for(int i = 0; i < s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vowelCount++;
			}
			else
			{
				consonentCount++;
			}
		}
		
		if(vowelCount > 5 && consonentCount > 3)
		System.out.println(vowelCount+" "+consonentCount);
//		System.out.println(Arrays.toString(ch));
	}
	
	public static void main(String[] args)
	{
		String s = "aeioup??";
		checkString(s);
	}
}
