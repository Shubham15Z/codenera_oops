/*
Write a program to check if a string is empty or not.
 */

package dec.java.str.methods2;

import java.util.Scanner;

public class Question4 
{
	void checkEmpty(String s1)
	{
		if(s1.length() == 0)
		{
			System.out.println("String is empty....");
		}
		else
		{
			System.out.println("String is not empty..");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s1 = sc.nextLine();
		
		Question4 q4 = new Question4();
		q4.checkEmpty(s1);
	
	}
}
