/*
 Q4. Front-Back Transformation - copy (Microsoft)
Input: S = "Hello"
Output: Svool
Explanation: 'H' is the 8th letter from the
beginning of alphabets, which is replaced by
'S' which comes at 8th position in reverse order
of alphabets. Similarly, all other letters are
replaced by their respective upper or lower case
letters accordingly.
 */
package string.practice.pkg;

public class Question4 
{
	public static void main(String[] args)
	{
		String s = "Hello";
		
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
			{
				sb= sb.append((char)('Z'-ch+'A'));
			}
			else if(ch >= 'a' && ch <= 'z')
			{
				sb = sb.append((char)('z'-ch+'a'));
			}
		}
		System.out.println(sb.toString());
	}
}
