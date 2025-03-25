/*
2. Write a program where a ZeroBalanceException is thrown when the account balance is zero. 
 */

package dec.java.custom.exception.pkg;

import java.util.Scanner;

class ZeroBalanceException extends Exception
{
	public ZeroBalanceException(String message) {
		super(message);
	}
}


public class Question2 
{
	public static void checkBalance(double balance) throws ZeroBalanceException
	{
		if(balance <= 0)
		{
			throw new ZeroBalanceException("Insufficient Fund, Please check your balance....");
		}
		else
		{
			System.out.println("Sufficient Balance");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a balance : ");
		double bal = sc.nextDouble();
		
		try {
			checkBalance(bal);
		} catch (ZeroBalanceException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
}
