/*
 1.enter a string by user and search particular element are present or not
 */

package dec.java.str.methods;

import java.util.Scanner;

public class Question1 
{
	void searchElement(String s1, char s2)
	{
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) == s2)
			{
				System.out.println("The element "+s2+" is present at "+i);
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String..");
		String s1 = sc.nextLine();
		System.out.println("Enter an element to search in string");
		char s2 = sc.next().charAt(0);
		
		Question1 q1 = new Question1();
		q1.searchElement(s1,s2);
	}
}
