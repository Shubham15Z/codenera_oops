/*
Q17. Replace a word
Example 1:
Input:
S = "xxforxx xx for xx"
oldW = "xx"
newW = "Geeks"
Output:
"geeksforgeeks geeks for geeks"
Explanation:
Replacing each "xx" with
"Geeks" in S.
Example 2:
Input:
S = "india is the xx country"
oldW = "xx"
newW = "best"

Output:
"india is the best country"
Explanation:
Replacing each "xx" with
"best" in S.
 */

package string.practice.pkg;

public class Question17 
{
	public static void main(String[] args) 
	{
//		String S = "xxforxx xx for xx";
		String S = "india is the xx country";
		String oldW = "xx";
		String newW = "best";
		
		String result = S.replaceAll(oldW, newW);
		
		System.out.println(result);
	}
}
