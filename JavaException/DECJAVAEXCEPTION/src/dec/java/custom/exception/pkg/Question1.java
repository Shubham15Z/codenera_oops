/*
1. Create a custom exception NegativeNumberException and throw it if the user enters a negative number.  
 */

package dec.java.custom.exception.pkg;

import java.util.Scanner;

class NegativeNumberException extends Exception
{
	public NegativeNumberException(String message) {
		super(message);
	}
}


public class Question1 
{
	public static void checkNumber(int num) throws NegativeNumberException
	{
		if(num < 0)
		{
			throw new NegativeNumberException("Please enter number greater than zero (0)...");
		}
		else
			System.out.println("Valid number...");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		try {
			checkNumber(num);
		} catch (NegativeNumberException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
