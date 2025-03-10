/*
20. Write a program to compare two strings without using the equals() method.
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question20 
{
	void compareString(String s1, String s2)
	{
		int count = 0;
		
		if(s1.length()==s2.length())
		{
			for(int i = 0; i <s1.length(); i++)
			{
				if(s1.charAt(i) != s2.charAt(i))
				{
					count++;
				}
			}
			if(count > 0)
			{
				System.out.println("Strings are not equal");
			}
			else
			{
				System.out.println("Strings are equal...");
			}
		}
		else
		{
			System.out.println("Strings are not equal...");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string 1 :");
		String s1 = sc.nextLine();
		
		System.out.println("Enter a string 2 :");
		String s2 = sc.nextLine();
		
		
		Question20 q20 = new Question20();
		q20.compareString(s1,s2);
	}
}
