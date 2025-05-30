/*
Q15. Find largest word in dictionary (MicroSoft)
Example 1:
Input: d = {"ale", "apple", "monkey", "plea"}
S = "abpcplea"
Output: "apple"
Explanation: After deleting "b", "c"
"a" S became "apple" which is present
in d.
 */

package string.practice.pkg;

import java.util.Arrays;
import java.util.List;

public class Question15 
{
	public static boolean isSubsequence(String word, String S)
	{
		int i = 0, j = 0;
		
		while(i < word.length() && j < S.length())
		{
			if(word.charAt(i) == S.charAt(j))
			{
				i++;
			}
			j++;
		}
		
		return i == word.length();
	}
	public static void main(String[] args) 
	{
		String S = "abpcplea";
		
		List<String> d = Arrays.asList("ale", "apple", "monkey", "plea");
		
		String longest = "";
		
		for(String word : d)
		{
			if(isSubsequence(word, S))
			{
				if(word.length() > longest.length() || (word.length() == longest.length() && word.compareTo(longest) < 0))
				{
					longest = word;
				}
			}
		}
		System.out.println("longest : "+longest);
	}
}
