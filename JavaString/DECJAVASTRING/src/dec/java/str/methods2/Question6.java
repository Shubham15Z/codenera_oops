/*
6. Write a program to convert a string to lowercase without using the toLowerCase() method.
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question6 
{
	void convertLowercase(String s1)
	{
		String s2 = "";
		
		for(int i = 0; i < s1.length(); i++)
		{
			char ch = s1.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z')
			{
				s2 = s2 + (char)(ch+32);
			}
			else
			{
				s2 = s2+ch;
			}
		}
		System.out.println("Lowercase is : "+s2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		
		Question6 q6 = new Question6();
		q6.convertLowercase(s1);
	}
}
