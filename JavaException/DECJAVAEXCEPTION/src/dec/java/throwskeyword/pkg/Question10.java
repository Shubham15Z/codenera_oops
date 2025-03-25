/*
10. Create a program that handles an exception inside a nested try-catch block.
 */

package dec.java.throwskeyword.pkg;

public class Question10 
{
	public static void print() throws ArithmeticException, ArrayIndexOutOfBoundsException
	{
		int[] arr = {2,4,7,3};
		System.out.println(arr[10]);
	}
	
	public void m1()
	{
//		print();
		try
		{
			try
			{
				System.out.println(5/0);
			}
			catch (ArithmeticException e) 
			{
				System.out.println("Arithmetic Exception Handled...");
			}
			print();
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handled...");
		}
	}
	
	public static void main(String[] args) 
	{
		Question10 q10 = new Question10();
		q10.m1();
	}
}
