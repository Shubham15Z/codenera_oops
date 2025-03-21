/*
5. Write a Java program to handle multiple exceptions using multiple catch blocks.  
 */
package dec.java.exception.pkg;

public class Question5 
{
	void multipleCatch()
	{
		int n1 = 10;
		String s1 = "123dfr";
		System.out.println(s1);
		
		try
		{
//			System.out.println(Integer.parseInt(s1));
			System.out.println(n1/0);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		System.out.println("After catch block");
	}
	
	public static void main(String[] args) 
	{
		Question5 q5 = new Question5();
		q5.multipleCatch();
	}
}
