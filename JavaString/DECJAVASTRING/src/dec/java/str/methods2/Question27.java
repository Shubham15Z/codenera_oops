/*
27. Write a program to insert a character at a specific position in a string. 
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question27 
{
	String insrtChar(String s1, char c1, int p1)
	{
		if(p1 < 1 || p1 > s1.length())
		{
			System.out.println("Enter a valid position...");
		}
		char[] ch = new char[s1.length()+1];
		
		for(int i = 0; i < p1-1; i++)
		{
			ch[i] = s1.charAt(i);
		}

		ch[p1-1] = c1;
		
		for(int i = p1; i < ch.length; i++)
		{
			ch[i] = s1.charAt(i-1);
		}
		
		
		return new String(ch);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = sc.nextLine();
		
		System.out.println("Enter a character to insert :");
		char c1 = sc.next().charAt(0);
		
		System.out.println("Enter a position to insert a character at : ");
		int p1 = sc.nextInt();
		
		Question27 q27 = new Question27();
		String result = q27.insrtChar(s1, c1, p1);
		
		System.out.println("After inserting char in the String is : "+result);
		
		
	}
}
