/*
25. Write a program to remove duplicate characters from a string.
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question25 
{
	void removeDuplicate(String s1)
	{
		String s2 = "";
		for(int i = 0; i < s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if(s2.indexOf(ch) == -1)
			{
				s2 = s2 + s1.charAt(i);
			}
		}
		System.out.println(s2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String s1 = sc.nextLine();
		
		Question25 q25 = new Question25();
		q25.removeDuplicate(s1);
	}
}
