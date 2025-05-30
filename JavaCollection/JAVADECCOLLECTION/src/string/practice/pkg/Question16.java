/*

Q16. Odd Even Problem (oracle)
Given a string S of lowercase english characters, find out whether the summation of X and Y is
even or odd, where X is the count of characters which occupy even positions in english

alphabets and have positive even frequency, and Y is the count of characters which occupy odd
positions in english alphabets and have positive odd frequency.
Note: Positive means greater than zero.
Example 1:
Input: S = "abbbcc"
Output: "ODD"
Explanation: X = 0 and Y = 1 so (X + Y) is
ODD. 'a' occupies 1st place(odd) in english
alphabets and its frequency is odd(1), 'b'
occupies 2nd place(even) but its frequency
is odd(3) so it doesn't get counted and 'c'
occupies 3rd place(odd) but its frequency
is even(2) so it also doesn't get counted.

Example 2:
Input: S = "nobitaa"
Output: "EVEN"
Explanation: X = 0 and Y = 2 so (X + Y) is
EVEN.
 */

package string.practice.pkg;

import java.util.Arrays;

public class Question16 
{
	public static void main(String[] args) 
	{
		String S = "nobitaa";
		
		int[] freq = new int[26];
		
		for(char ch : S.toCharArray())
		{
			freq[ch-'a']++;
		}
//		System.out.println(Arrays.toString(freq));
		
		int X = 0, Y = 0;
		
		for(int i = 0; i < 26; i++)
		{
			int position = i+1;
			
			int f = freq[i];
			
			if(f > 0)
			{
				if(position % 2 == 0 && f % 2 == 0)
				{
					X++;
				}
				else if(position % 2 != 0 && f % 2 != 0)
				{
					Y++;
				}
			}
		}
		
		int sum = X+Y;
		
		if(sum % 2 == 0)
		{
			System.out.println("EVEN");
		}
		else
		{
			System.out.println("ODD");
		}
	}
}
