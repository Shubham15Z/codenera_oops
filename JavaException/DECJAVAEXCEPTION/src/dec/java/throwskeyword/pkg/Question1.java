/*
1. Write a program to handle ArithmeticException using try-catch while dividing a number by zero.  
 */

package dec.java.throwskeyword.pkg;

public class Question1 
{
	public static void print() throws ArithmeticException
	{
		System.out.println(5/0);
	}
	
	public void m1()
	{
		try
		{
			print();
		}
		catch(ArithmeticException e)
		{
			System.out.println("print method might throws exception...");
		}
		
	}
	
	public static void main(String[] args) 
	{
		Question1 q1 = new Question1();
		q1.m1();
	}
}
