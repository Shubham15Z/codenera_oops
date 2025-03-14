/*
Q9. Write a Java program to create a new string from a given string swapping the last two
characters of the given string. The length of the given string must be two or more.
Sample Output:
The given strings is: string
The string after swap last two characters are: strign
 */

package dec.java.str.method.assign02.pkg;

import java.util.Scanner;

public class Question9 
{
	private String s1;
	
	Question9()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		this.s1 = sc.nextLine();
		
		sc.close();
	}
	
	String swapChar()
	{
		if(s1.length()>=2)
		{
			String part = s1.substring(0, s1.length()-2);
			
			char last = s1.charAt(s1.length()-1);
			char secondLast = s1.charAt(s1.length()-2);
			
			return "The new string after swapping is "+part+last+secondLast;
		}
		else
		{
			return "Enter a valid String";
		}
	}
	
	void display()
	{
		String s2 = swapChar();
		
		System.out.println(s2);
	}
	
	public static void main(String[] args) 
	{
		Question9 q9 = new Question9();
		q9.display();
	}
}
