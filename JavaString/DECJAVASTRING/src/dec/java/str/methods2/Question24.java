/*
24. Write a program to print the ASCII values of all characters in a string. 
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question24 
{
	void printAsciiValues(String s1)
	{
		for(int i = 0; i < s1.length(); i++)
		{
			System.out.println("Character : "+s1.charAt(i)+" ASCII value :"+(int)s1.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = sc.nextLine();
		
		Question24 q24 = new Question24();
		q24.printAsciiValues(s1);
	}
}
