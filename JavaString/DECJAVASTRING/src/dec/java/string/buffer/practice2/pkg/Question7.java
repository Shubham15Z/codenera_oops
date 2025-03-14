/*
7. Implement a Java program where an array of full names is shortened to initials using StringBuffer and OOP concepts. 
 */

package dec.java.string.buffer.practice2.pkg;

import java.util.Arrays;

public class Question7 
{
	void fullNameToShort(String[] s1)
	{
		for(int i = 0; i < s1.length; i++)
		{
			StringBuffer sb = new StringBuffer();
			String[] nameParts = s1[i].split("\\s+");
			
			for(String name : nameParts)
			{
				sb.append(name.charAt(0));
			}
			
			s1[i] = sb.toString();
		}
		System.out.println("The new names with shorthand are : ");
		System.out.println(Arrays.toString(s1));
	}
	public static void main(String[] args) 
	{
		String[] s1 = {"Rahul Sharma", "Ajay Patil", "Vishal Nawale", "Vijay Chavan"};

		Question7 q7 = new Question7();
		q7.fullNameToShort(s1);
	}
}
