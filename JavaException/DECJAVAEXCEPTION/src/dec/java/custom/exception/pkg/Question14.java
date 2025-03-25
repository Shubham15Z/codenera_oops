/*
14. Write a program that throws an InvalidPhoneNumberException if the phone number has less than 10 digits.  
 */

package dec.java.custom.exception.pkg;

import java.util.Scanner;

class InvalidPhoneNumberException extends Exception
{
	public InvalidPhoneNumberException(String message) {
		super(message);
	}
}

public class Question14 
{
	public static void checkPhoneNumber(String phone) throws InvalidPhoneNumberException
	{
		
		if(phone.length() < 10 || phone.length() > 10)
		{
			throw new InvalidPhoneNumberException("Please check your phone number");
		}
		else
			System.out.println("Valid phone number...");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a phone number : ");
		String phone = sc.nextLine();
		
		try
		{
			checkPhoneNumber(phone);
		}
		catch(InvalidPhoneNumberException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
