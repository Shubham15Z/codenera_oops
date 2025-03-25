/*
9. Define an InvalidEmailException that gets triggered when an email does not contain '@'.  
 */

package dec.java.custom.exception.pkg;

import java.util.Scanner;


class InvalidEmailException extends Exception
{
	public InvalidEmailException(String message) {
		super(message);
	}
}

public class Question9
{
	public static void checkEmail(String email) throws InvalidEmailException
	{
		if(!email.contains("@"))
		{
			throw new InvalidEmailException("Please enter valied Email Id...");
		}
		else
			System.out.println("email is valid");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a speed : ");
		String email = sc.nextLine();
		
		try
		{
			checkEmail(email);
		}
		catch(InvalidEmailException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
