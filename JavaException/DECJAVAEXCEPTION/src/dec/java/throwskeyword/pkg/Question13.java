/*
13. Implement a program where an exception occurs in the try block, but the finally block still executes. 
 */

package dec.java.throwskeyword.pkg;

public class Question13 
{
	public static void print() throws ArithmeticException, ArrayIndexOutOfBoundsException
	{
		int[] arr = {2,4,7,3};
		System.out.println(arr[10]);
	}
	
	public void m1()
	{
		try
		{
			System.out.println(5/0);
			print();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled...");
		}
		finally {
			System.out.println("Finally block will executes....");
		}
	}
	
	public static void main(String[] args) 
	{
		Question13 q13 = new Question13();
		q13.m1();
	}
}
