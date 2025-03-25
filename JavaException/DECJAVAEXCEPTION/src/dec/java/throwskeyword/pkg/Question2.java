/*
2. Create a program to handle ArrayIndexOutOfBoundsException when accessing an invalid index of an array.
 */
package dec.java.throwskeyword.pkg;

public class Question2 
{
	public static void print() throws ArrayIndexOutOfBoundsException
	{
		int[] arr = {2,3,4,6};
		System.out.println(arr[8]);
	}
	
	public void m1()
	{
		try
		{
			print();
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("print method might throws ArrayIndexOutOfBoundsException...");
		}
		
	}
	
	public static void main(String[] args) 
	{
		Question2 q2 = new Question2();
		q2.m1();
	}
}
