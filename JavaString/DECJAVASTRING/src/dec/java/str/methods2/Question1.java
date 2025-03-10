/*
Write a program to input a string and print it.
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question1 
{
	void printString(String s1)
	{
		System.out.println(s1);
		for(int i = 0; i < s1.length(); i++)
		{
			System.out.print(s1.charAt(i)+", ");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		
		Question1 q1 = new Question1();
		q1.printString(s1);
	}
}
