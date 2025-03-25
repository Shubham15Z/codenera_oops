/*
 5. Implement a TooYoungException that is thrown when a person's age is below 18 for voting.  
 */

package dec.java.custom.exception.pkg;

import java.util.Scanner;

class TooYoungException extends Exception
{
	public TooYoungException(String message) {
		super(message);
	}
}
public class Question5 
{
	public static void checkAge(int age) throws TooYoungException
	{
		if(age < 18)
		{
			throw new TooYoungException("You are Still young to vote..");
		}
		else
			System.out.println("Valid age...");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age : ");
		int age = sc.nextInt();
		
		try {
			checkAge(age);
		} catch (TooYoungException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
