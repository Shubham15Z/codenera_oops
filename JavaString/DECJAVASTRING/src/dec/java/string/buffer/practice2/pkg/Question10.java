/*
10. Implement a program that converts all vowels in an array of strings to uppercase using StringBuilder.
 */

package dec.java.string.buffer.practice2.pkg;

import java.util.Arrays;

public class Question10 
{
	void vowelsUppercase(String[] s1)
	{	
		for(int i = 0; i < s1.length; i++)
		{
			StringBuffer sb = new StringBuffer(s1[i]);
			for(int j = 0; j < s1[i].length(); j++)
			{
				char ch = sb.charAt(j);
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				{
					sb.setCharAt(j, Character.toUpperCase(ch));
				}
			}
			s1[i] = sb.toString();
		}
		System.out.println(Arrays.toString(s1));
	}
	public static void main(String[] args) 
	{
		String[] s1 = {"Hello", "java", "is", "I", "am", "fine", "Is"};

		Question10 q10 = new Question10();
		q10.vowelsUppercase(s1);
	}
}
