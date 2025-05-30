/*

Q19. Same characters in two strings
Given two strings A and B of equal length, find how many times the corresponding position in
the two strings hold exactly the same character. The comparison should not be case sensitive.
Example 1:
Input:
A = choice
B = chancE
Output: 4
Explanation: characters at position 0, 1, 4 and 5
are the same in the two strings A and B.

 */

package string.practice.pkg;

import java.util.Arrays;

public class Question19 
{
	public static void main(String[] args) 
	{
		String s1 = "choice";
		String s2 = "chancE";
		
		int count = 0;
		
		for(int i = 0; i < s1.length(); i++)
		{
			if(Character.toLowerCase(s1.charAt(i)) == Character.toLowerCase(s2.charAt(i)))
			{
				count++;
			}
			else
			{
				continue;
			}
		}
		System.out.println(count);
	}
}
