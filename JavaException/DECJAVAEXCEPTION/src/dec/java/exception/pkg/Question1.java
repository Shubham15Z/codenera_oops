/*
1. Write a Java program to handle an arithmetic exception when dividing a number by zero.  
 */

package dec.java.exception.pkg;

public class Question1 
{
	void divideNumer()
	{
		int n1 = 10;
		System.out.println(n1);
		
		try
		{
			System.out.println(n1/0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println("The given number is "+n1);
	}
	
	public static void main(String[] args) 
	{
		Question1 q1 = new Question1();
		q1.divideNumer();
	}
}
