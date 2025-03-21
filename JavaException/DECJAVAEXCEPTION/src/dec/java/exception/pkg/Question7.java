/*
7. Write a Java program to catch and handle an input mismatch exception.  
 */

package dec.java.exception.pkg;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question7 
{
	void inputMismatch()
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("Enter a number :");
			int n1 = sc.nextInt();
			System.out.println("You entered "+n1);
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
		finally 
		{
			sc.close();
		}
	}
	
	public static void main(String[] args) 
	{
		Question7 q7 = new Question7();
		q7.inputMismatch();
	}
}
