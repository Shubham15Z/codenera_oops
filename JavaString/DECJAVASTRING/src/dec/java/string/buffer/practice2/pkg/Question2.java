/*
2. Implement a program that appends all elements of a string array into a single string using StringBuilder and 
prints the final result. 
 */

package dec.java.string.buffer.practice2.pkg;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 
{
	void appendWords(String[] s1)
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < s1.length; i++)
		{
			sb.append(s1[i]+" ");
		}
		System.out.println("The new String is");
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a size of String array :");
		int size = sc.nextInt();
		String[] s1 = new String[size];
		
		System.out.println("Enter the String array elements : ");
		for(int i = 0; i < s1.length; i++)
		{
			s1[i] = sc.next();
		}
		Question2 q2 = new Question2();
		q2.appendWords(s1);
	}
}
