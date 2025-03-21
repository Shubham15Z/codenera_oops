/*
8. Write a Java program to demonstrate exception handling using a try-catch block.
 */

package dec.java.exception.pkg;

public class Question8
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
		Question8 q8 = new Question8();
		q8.numberFormat();
	}
}
