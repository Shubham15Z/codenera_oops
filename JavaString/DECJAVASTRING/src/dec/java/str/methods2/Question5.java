/*
5.Write a program to convert a string to uppercase without using the toUpperCase() method.
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question5 
{
	void convertUppercase(String s1)
	{
		String s2 = "";
		
		for(int i = 0; i < s1.length(); i++)
		{
			char ch = s1.charAt(i);
			
			if(ch >= 'a' && ch <= 'z')
			{
				s2 = s2 + (char)(ch-32);
			}
			else
			{
				s2 = s2+ch;
			}
		}
		
		System.out.println("Uppercase is : "+s2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		
		Question5 q5 = new Question5();
		q5.convertUppercase(s1);
	}
}
