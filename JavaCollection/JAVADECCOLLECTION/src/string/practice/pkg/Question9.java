/*
Q9. Change the string (yahoo)
Input:

S = "abCD"
Output: abcd
Explanation: The first letter (a) is
lowercase. Hence, the complete string
is made lowercase.
 */
package string.practice.pkg;

public class Question9
{
	public static String changeString(String s)
	{
		char ch = s.charAt(0);
		if(Character.isLowerCase(ch))
		{
			return s.toLowerCase();
		}
		else if(Character.isUpperCase(ch))
		{
			return s.toUpperCase();
		}
		return s;
	}
	public static void main(String[] args) 
	{
		String s = "abCD";
		
		String result = changeString(s);
		
		System.out.println(result);
	}
}
