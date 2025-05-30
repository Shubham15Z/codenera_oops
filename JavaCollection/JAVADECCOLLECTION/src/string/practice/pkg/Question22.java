/*
Q22. Difficulty of sentence
Given a sentence as a string S. Calculate difficulty of a given sentence.
Difficulty of sentence is defined as 5*(number of hard words) + 3*(number of easy words). A
word in the given string is considered hard if it has 4 consecutive consonants or the number of
consonants is more than the number of vowels. Else the word is easy.
Note: uppercase and lowercase characters are the same.
Example
Input:
S = "Difficulty of sentence"
Output:
13
Explanation:
2 hard words + 1 easy word
Example
Input:
S = "I am good"
Output:
9
Explanation:

3 easy words

 */

package string.practice.pkg;

public class Question22
{
	public static boolean isHard(String word)
	{
		String vowels = "aeiou";
		word = word.toLowerCase();
		int consonantCount = 0;
		int vowelCount = 0;
		int consecutiveConsonantsCount = 0;
		
		for(int i = 0; i < word.length(); i++)
		{
			char ch = word.charAt(i);
			if(Character.isLetter(ch))
			{
				if(vowels.indexOf(ch) != -1)
				{
					vowelCount++;
					consecutiveConsonantsCount = 0;
				}
				else
				{
					consonantCount++;
					consecutiveConsonantsCount++;
					if(consecutiveConsonantsCount >= 4)
					{
						return true;
					}
				}
			}
		}
		return consonantCount > vowelCount;
	}
	public static void main(String[] args)
	{
		String S = "I am good";
		
		int numOfHardWord = 0, numOfEasyWord = 0;
		
		String[] words = S.split(" ");
		
		for(String str : words)
		{
			if(isHard(str))
			{
				numOfHardWord++;
			}
			else
			{
				numOfEasyWord++;
			}
		}
		
		int difficulty = 5*numOfHardWord + 3*numOfEasyWord;
		
		System.out.println(difficulty);
		
	}
}
