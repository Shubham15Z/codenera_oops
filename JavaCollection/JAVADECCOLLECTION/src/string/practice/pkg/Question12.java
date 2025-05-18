/*
Q12. Rearrange a string
Example 1:
Input: S = "AC2BEW3"
Output: "ABCEW5"
Explanation: 2 + 3 = 5 and we print all
alphabets in the lexicographical order.
Example 2:
Input: S = "ACCBA10D2EW30"
Output: "AABCCDEW6"
Explanation: 0+1+2+3 = 6 and we print
all alphabets in the lexicographical order.
 */

package string.practice.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Question12 
{
	public static String rearrangeString(String s1)
	{
		StringBuilder sb = new StringBuilder();
		int sum = 0;
		
		for(int i = 0; i < s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if(Character.isLetter(ch))
				sb.append(ch);
			else if(Character.isDigit(ch))
				sum+= ch-'0';
		}
		
		char[] ch = sb.toString().toCharArray();
		Arrays.sort(ch);
		
		return new String(ch)+sum;
	}
	public static void main(String[] args)
	{
		String S = "ACCBA10D2EW30";
		String res = rearrangeString(S);
		System.out.println(res);
	}
}
