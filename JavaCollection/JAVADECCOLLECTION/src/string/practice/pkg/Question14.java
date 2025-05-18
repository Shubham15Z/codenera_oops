/*
Q14. Special array reversal (google)
Example 1:
Input: S = "A&B"
Output: "B&A"
Explanation: As we ignore '&' and
then reverse, so answer is "B&A".
Example 2:
Input: S = "A&x#
Output: "x&A#"
Explanation: we swap only A and x.
 */

package string.practice.pkg;

public class Question14 
{
	public static String swapLetters(String s)
	{
		char[] ch = s.toCharArray();
		int left = 0;
		int right = ch.length-1;
		
		while(left < right)
		{
			if(!Character.isLetter(ch[left]))
			{
				left++;
			}
			else if(!Character.isLetter(ch[right]))
			{
				right--;
			}
			else
			{
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left++;
				right--;
			}
		}
		return new String(ch);
	}
	
	public static void main(String[] args)
	{
		String S = "A&x#";
//		String S = "A&B";
		
		String res = swapLetters(S);
		System.out.println(res);
	}
}
