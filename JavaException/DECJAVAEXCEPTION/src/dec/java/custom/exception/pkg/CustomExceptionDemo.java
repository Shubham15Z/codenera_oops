package dec.java.custom.exception.pkg;

import java.util.Scanner;

class AgeNotValid extends Exception
{
	public AgeNotValid(String message)
	{
		super(message);
	}
}

public class CustomExceptionDemo 
{
	public static void checkAge(int age) throws AgeNotValid
	{
		if(age < 18)
		{
			throw new AgeNotValid("Age should be greater than 18");
		}
		else
		{
			System.out.println("Valid age...");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		try {
			checkAge(age);
		} catch (AgeNotValid e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
