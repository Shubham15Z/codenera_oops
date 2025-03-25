/*
16. Write a program that throws ArithmeticException manually when a number is divided by zero. 
 */

package dec.java.throwskeyword.pkg;

public class Question16 
{
	 public static void divide(int numerator, int denominator) 
	 {
	        if (denominator == 0) 
	        {
	            throw new ArithmeticException("Cannot divide by zero!");
	        }
	        else 
	        {
	            System.out.println("Result: " + (numerator / denominator));
	        }
	}

	public void m1() throws Exception
	{
//		divide(10,0);
		try
		{
			divide(10,0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("print method might throws Arithmetic exception...");
		}
		
	}
	
	public static void main(String[] args) throws Exception 
	{
		Question16 q16 = new Question16();
		q16.m1();
	}
}
