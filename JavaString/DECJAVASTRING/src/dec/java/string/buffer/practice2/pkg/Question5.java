/*
5. Implement a program that replaces all occurrences of a given character in a string array using StringBuffer and 
prints the modified array. 
 */

package dec.java.string.buffer.practice2.pkg;

import java.util.Arrays;

public class Question5 
{
	void replaceChar(String[] s1,char old1, char new1)
	{
		for(int i = 0; i < s1.length; i++)
		{
			StringBuffer sb = new StringBuffer(s1[i]);
			for(int j = 0; j < sb.length(); j++)
			{
				if(sb.charAt(j) == old1)
				{
					sb.setCharAt(j, new1);
				}
			}
			s1[i] = sb.toString();
		}
		System.out.println("The new String array is : ");
		System.out.println(Arrays.toString(s1));
	}
	public static void main(String[] args) 
	{
		String[] s1 = {"Java", "Spring", "Hibernate", "Microservices", "Angular"};
		char old1 = 'a';
		char new1 = 'i';
		Question5 q5 = new Question5();
		q5.replaceChar(s1,old1,new1);
	}
}
