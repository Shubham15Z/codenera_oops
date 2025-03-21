/*
6. Write a Java program that demonstrates the use of a finally block.
 */

package dec.java.exception.pkg;

public class Question6 
{
	void numberFormat()
	{
		String s1 = "123dfr";
		System.out.println(s1);
		
		try
		{
			System.out.println(Integer.parseInt(s1));
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		finally 
		{
			System.out.println("Finally block executes");
		}
	}
	
	public static void main(String[] args) 
	{
		Question6 q6 = new Question6();
		q6.numberFormat();
	}
}
