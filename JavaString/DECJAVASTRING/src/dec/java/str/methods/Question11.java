/*
 11.Wap enter a string and remove all duplicate character using class and object.
 */

package dec.java.str.methods;

import java.util.Scanner;

public class Question11
{
	void removeDuplicate(String s1)
	{
		String s2 = "";
		for(int i = 0; i < s1.length(); i++)
		{
			char ch = s1.charAt(i);
			
			
			if(s2.indexOf(ch) == -1)
			{
				s2 = s2+ch;
			}
		}
		
		System.out.println(s2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		
		Question11 q11 = new Question11();
		q11.removeDuplicate(s1);
	}
}
