package practice.oop.java.pkg;

class Account
{
	public void addAccount() {
		System.out.println("add account method from Account");
	}
}

class SavingAccount extends Account
{
	public void addAccount()
	{
		System.out.println("add account method from Saving Account");
	}
}

class CurrentAccount extends Account
{
	public void addAccount()
	{
		System.out.println("add account method from Current Account");
	}
}
public class Question12 
{
	public static void main(String[] args) 
	{
		Account a1 = new Account();
		a1.addAccount();
		Account a2 = new SavingAccount();
		a2.addAccount();
		Account a3 = new CurrentAccount();
		a3.addAccount();
	}
}
