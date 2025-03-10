/*
15. Write a program to replace all occurrences of a character in a string with another character.
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question15 
{
	void replaceAll(String s1, char old1, char new1)
	{
		System.out.println(s1.replace(old1, new1));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		System.out.println("Enter a character to replace :");
		char c1 = sc.next().charAt(0);
		System.out.println("Enter a new character :");
		char c2 = sc.next().charAt(0);
		
		Question15 q15 = new Question15();
		q15.replaceAll(s1,c1,c2);
	}
}
