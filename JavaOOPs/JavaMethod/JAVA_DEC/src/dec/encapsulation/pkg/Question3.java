/*
 Define a class BankAccount with private attributes accountNumber and balance. 
 Implement getter methods to view the balance and account number.
 */

package dec.encapsulation.pkg;

class BankAccount
{
	private int accountNumber;
	private double balance;
	
	public BankAccount(int accountNumber, double balance) 
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public double getBalance()
	{
		return balance;
	}
}

public class Question3 
{
	public static void main(String[] args)
	{
		BankAccount b1 = new BankAccount(1005, 500000);
		System.out.println("Bank account details are : acc no = "+b1.getAccountNumber()+" bal = "+b1.getBalance());
	}
}
