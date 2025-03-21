/*
17. Write a Java program that catches and handles a negative array size exception. 
 */

package dec.java.exception.pkg;

public class Question17 
{
	void negativeArray()
	{
		System.out.println("Before try block");
		try
		{
			int size = -7;
			int[] a1 = new int[size];
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println(e);
		}
		
		System.out.println("After catch block");
	}
	
	public static void main(String[] args) 
	{
		Question17 q17 = new Question17();
		q17.negativeArray();
	}
}
