/*
Q2. Delete alternate characters (Amazon)
Input: S = "Geeks"
Output: "Ges"
Explanation: Deleted "e" at index 1
and "k" at index 3.
 */

package string.practice.pkg;

public class Question2 
{
	public static void main(String[] args)
	{
		String s = "Geeks";
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < s.length(); i++)
		{
			if(i % 2 == 0)
			{
				sb.append(s.charAt(i));
			}
		}
		
		System.out.println(sb.toString());
	}
}
