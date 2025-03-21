/*
 Q13. Write a Java program to create a new string repeating every character twice of a
given string.
Sample Output:
The given string is: welcome
The new string is: wweellccoomme
 */

package dec.java.str.method.assign02.pkg;

import java.util.Scanner;

public class Question13 
{
	private String s1;
	Question13()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		this.s1 = sc.nextLine();
		
	}
	
	void doubleChar()
	{
		String s2 = "";
		
		for(int i = 0; i < s1.length(); i++)
		{
			char ch = s1.charAt(i);
			
			s2 += ch+""+ch;
		}
		
		System.out.println("Percentage of Uppercase : "+s2);
	}
	
	public static void main(String[] args) 
	{
		Question13 q13 = new Question13();
		q13.doubleChar();
	}
}
