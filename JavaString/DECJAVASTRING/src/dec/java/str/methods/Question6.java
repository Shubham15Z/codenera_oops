/*
 6.Write a Java program to concatenate two strings.
 */

package dec.java.str.methods;

import java.util.Scanner;

public class Question6 
{
	void concatString(String s1, String s2)
	{
		String s3 = s1.concat(s2);
		System.out.println("The String s3 after concat of s1 and s2 is :"+s3);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string 1 : ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter a string 2 : ");
		String s2 = sc.nextLine();
		
		Question6 q6 = new Question6();
		q6.concatString(s1,s2);
	}
}
