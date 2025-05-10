/*
9. Check if Palindrome: Create a lambda expression that takes a string and returns true if it is a palindrome, otherwise false.
 */

package lambdaexpression.pkg;

interface PalindromeString
{
	public boolean isPalindrome(String s1);
}
public class Question9
{
	public static void main(String[] args) 
	{
		String s = "madam";
		
		PalindromeString p1 = (String s1) -> {
			int left = 0;
			int right = s1.length()-1;
			while(left < right)
			{
				if(s1.charAt(left) != s1.charAt(right))
				{
					return false;
				}
				left++;
				right--;
			}
			return true;
		};
		
		boolean res = p1.isPalindrome(s);
		System.out.println(res);
	}
}
