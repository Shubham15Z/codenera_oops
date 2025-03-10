/*
Write a program to find the last occurrence of a character in a string.
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question14 
{
	void lastOccurance(String s1, char c1)
	{
		System.out.println(s1.lastIndexOf(c1));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		System.out.println("Enter a character :");
		char c1 = sc.next().charAt(0);
		
		Question14 q14 = new Question14();
		q14.lastOccurance(s1,c1);
	}
}
