/*
 2. Write a program to find the length of a given string.
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question2 
{
	void lengthString(String s1)
	{
		System.out.println(s1.length());
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		
		Question2 q2 = new Question2();
		q2.lengthString(s1);
	}
}
