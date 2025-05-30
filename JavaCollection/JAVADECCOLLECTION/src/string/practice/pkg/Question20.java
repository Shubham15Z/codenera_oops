/*

Q20. Maximum number of characters between any two same character
Given a string containing lower and uppercase alphabets, the task is to find the maximum
number of characters between any two same characters in the string.
Example 1:
Input:
S = "socks"

Output: 3
Explanation: There are 3 characters between
the two occurrences of 's'.
 */


package string.practice.pkg;

public class Question20 
{
	public static void main(String[] args) 
	{
		String S = "socks";
		int max = -1;
		
		for(int i = 0; i < S.length(); i++)
		{
			for(int j = S.length()-1; j > i; j--)
			{
				if(S.charAt(i) == S.charAt(j))
				{
					int count = j-i-1;
					max = Math.max(max, count);
					break;
				}
			}
		}
		
		System.out.println(max);
	}
}
