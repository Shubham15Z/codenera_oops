/*
6. Write a program that throws an InvalidPasswordException when the password length is less than 8.  
 */

package dec.java.custom.exception.pkg;

import java.util.Scanner;

class InvalidPasswordException extends Exception
{
	public InvalidPasswordException(String message) {
		super(message);
	}
}

public class Question6 
{
	public static void checkPassword(String pass) throws InvalidPasswordException
	{
		if(pass.length() < 8)
		{
			throw new InvalidPasswordException("Please enter a strong password of length greater than 8...");
		}
		else
			System.out.println("Password accepted...");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a password : ");
		String pass = sc.nextLine();
		
		try
		{
			checkPassword(pass);
		}
		catch(InvalidPasswordException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
