/*
 1. Throw ArithmeticException for division by zero. 
 */
package dec.java.throwexception.pkg;

public class Question1 
{
	void divideZero()
	{
		int n = 50;
		int m = 0;
		
		if(m == 0)
		{
			throw new ArithmeticException("Divide by zero is not possible..");
		}
		
		int res = n/m;
		System.out.println("res = "+res);
	}
	
	public static void main(String[] args) {
		Question1 q1 = new Question1();
		q1.divideZero();
	}
}
