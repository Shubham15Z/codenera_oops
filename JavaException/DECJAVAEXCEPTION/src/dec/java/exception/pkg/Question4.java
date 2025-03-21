/*
4. Write a Java program that catches and handles a number format exception.
 */

package dec.java.exception.pkg;

public class Question4 
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
		
		System.out.println("After catch block");
	}
	
	public static void main(String[] args) 
	{
		Question4 q4 = new Question4();
		q4.numberFormat();
	}
}
