/*
6. Throw IllegalStateException if withdrawal amount exceeds balance. 
 */

package dec.java.throwexception.pkg;

public class Question6
{
	void withdrawAmount()
	{
		double balance = 5000.0;
		double amount = 8000.0;
		
		if(amount > balance)
		{
			throw new IllegalStateException("Insufficient Funds");
		}
		
		
		System.out.println("remaining = "+(balance-amount));
	}
	
	public static void main(String[] args) {
		Question6 q6 = new Question6();
		q6.withdrawAmount();
	}
}
