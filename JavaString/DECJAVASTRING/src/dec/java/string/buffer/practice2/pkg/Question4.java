/*
4. Write a Java program that finds the longest string in an array using StringBuilder and 
object-oriented programming principles.
 */

package dec.java.string.buffer.practice2.pkg;

import java.util.Scanner;

public class Question4 
{
	void longestString(String[] s1)
	{
		StringBuilder longest = new StringBuilder(s1[0]);
		for(int i = 1; i < s1.length; i++)
		{
			if(s1[i].length() > longest.length())
				longest = new StringBuilder(s1[i]);
		}
		System.out.println("The longest String is");
		System.out.println(longest);
	}
	public static void main(String[] args) 
	{
		String[] s1 = {"Java", "Spring", "Hibernate", "Microservices", "Angular"};
		Question4 q4 = new Question4();
		q4.longestString(s1);
	}
}
