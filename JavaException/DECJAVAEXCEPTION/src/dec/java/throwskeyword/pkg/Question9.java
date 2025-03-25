/*
9. Write a program that catches multiple exceptions in a single try-catch block 
(e.g., ArithmeticException and ArrayIndexOutOfBoundsException). 
 */

package dec.java.throwskeyword.pkg;

public class Question9 
{
	public static void print() throws ArithmeticException, ArrayIndexOutOfBoundsException
	{
		int[] arr = {2,4,7,3};
//		System.out.println(arr[10]);
		System.out.println(5/0);
	}
	
	public void m1()
	{
//		print();
		try
		{
			print();
		}
		catch(ArithmeticException e)
		{
			System.out.println("print method might throws ArithmeticException...");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled...");
		}
		
	}
	
	public static void main(String[] args) 
	{
		Question9 q9 = new Question9();
		q9.m1();
	}
}
