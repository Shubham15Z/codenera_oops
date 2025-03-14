/*
1. Write a Java program that takes an array of strings, converts each string to uppercase using StringBuffer, 
and stores the results in a new array.  
 */
package dec.java.string.buffer.practice2.pkg;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 
{
	void uppercaseWord(String[] s1)
	{
		String[] s2 = new String[s1.length];
		
		for(int i = 0; i < s1.length; i++)
		{
			StringBuffer sb = new StringBuffer(s1[i]);
			s2[i] = sb.toString().toUpperCase();
		}
		System.out.println("The uppercase elements are :");
		System.out.println(Arrays.toString(s2));
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
		Question1 q1 = new Question1();
		q1.uppercaseWord(s1);
	}
}
