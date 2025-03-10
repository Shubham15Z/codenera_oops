/*
9.Write a Java program to find the occurence of first word in the string.
 */

package dec.java.str.methods;

import java.util.Scanner;

public class Question9 
{
	void occuranceWord(String s1, String s2)
	{
		System.out.println(s1.indexOf(s2));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		
		System.out.println("Enter a word :");
		String s2 = sc.nextLine();
		
		Question9 q9 = new Question9();
		q9.occuranceWord(s1,s2);
	}
}
