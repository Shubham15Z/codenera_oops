/*
Q1. Reverse the vowels only (Flipkart) 
S = "practice"
Output: prectica
Explanation: The vowels are a, i, e
Reverse of these is e, i, a.
*/

package string.practice.pkg;

public class Question1 
{
	public static String reverseVowels(String s1)
	{
		char[] c1 = s1.toCharArray();
		int left = 0;
		int right = c1.length-1;
		
		while(left < right)
		{
			while(left < right && !isVowel(c1[left]))
			{
				left++;
			}
			while(left < right && !isVowel(c1[right]))
			{
				right--;
			}
			char temp = c1[left];
			c1[left] =  c1[right];
			c1[right] = temp;
			left++;
			right--;
		}
		return new String(c1);
	}
	
	public static boolean isVowel(char c)
	{
		c = Character.toLowerCase(c);
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
	}
	public static void main(String[] args) 
	{
		String s = "practice";
		System.out.println(s);
		String result  = reverseVowels(s);
		System.out.println(result);
	}
}
