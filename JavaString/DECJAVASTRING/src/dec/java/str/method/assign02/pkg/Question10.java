/*

Q10. Write a Java program to read a given string and if the first or last characters are same
return the string without those characters otherwise return the string unchanged
 */

package dec.java.str.method.assign02.pkg;

import java.util.Scanner;

public class Question10
{
	private String s1;
	
	Question10()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		this.s1 = sc.nextLine();
		
		sc.close();
	}
	
	String checkFirstLastChar()
	{
		if(s1.length()>=2)
		{
			String part = s1.substring(1, s1.length()-1);
			
			char first = s1.charAt(0);
			char last = s1.charAt(s1.length()-1);
			
			if(first == last)
				return "The new string after removing first and last char is "+part;
			else
				return s1;
		}
		else
		{
			return "Enter a valid String";
		}
	}
	
	void display()
	{
		String s2 = checkFirstLastChar();
		
		System.out.println(s2);
	}
	
	public static void main(String[] args) 
	{
		Question10 q10 = new Question10();
		q10.display();
	}
}
