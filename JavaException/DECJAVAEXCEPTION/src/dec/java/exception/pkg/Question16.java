/*
16. Write a Java program to handle multiple exceptions in a single catch block. 
 */

package dec.java.exception.pkg;

public class Question16
{
	void numberFormat()
	{
		try
		{
			String s1 = "123dfr";
			System.out.println(s1);
			int n1 = 10;
//			System.out.println(Integer.parseInt(s1));
			System.out.println(n1/0);
		}
		catch(NumberFormatException | ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("After catch block");
	}
	
	public static void main(String[] args) 
	{
		Question16 q16 = new Question16();
		q16.numberFormat();
	}
}
