/*
16. Write a program to remove all spaces from a string.
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question16 
{
	void removeSpace(String s1)
	{
		String s2 = "";
		for(int i = 0; i < s1.length(); i++)
		{
			if(s1.charAt(i) == ' ')
			{
				continue;
			}
			else
			{
				s2 = s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		
		
		Question16 q16 = new Question16();
		q16.removeSpace(s1);
	}
}
