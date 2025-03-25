/*
12. Define a MinBalanceException for a bank account, ensuring the balance never goes below ₹1000.  
 */

package dec.java.custom.exception.pkg;

import java.util.Scanner;

class MinBalanceException extends Exception
{
	public MinBalanceException(String message) {
		super(message);
	}
}

public class Question12 
{
	public static void checkBalance(double balance, double amount) throws MinBalanceException
	{
		double newBalance = balance - amount;
		
		if(newBalance < 1000)
		{
			throw new MinBalanceException("Please check your withdraw amount...");
		}
		else
			System.out.println("Minimum balance maintained");
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a your balance : ");
		double balance = sc.nextDouble();
		
		System.out.println("Enter a withdraw amount : ");
		double amount = sc.nextDouble();
		
		try
		{
			checkBalance(balance, amount);
		}
		catch(MinBalanceException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
