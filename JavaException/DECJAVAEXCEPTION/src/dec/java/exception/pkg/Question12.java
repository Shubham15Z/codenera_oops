/*
12. Write a Java program that catches and handles an illegal argument exception.  
 */

package dec.java.exception.pkg;

public class Question12 
{
	void checkAge(int age)
	{
		try
		{
			if(age < 0)
			{
				throw new IllegalArgumentException("Age cannot be negative!");
			}
			System.out.println("Age is : "+age);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String[] args)
	{
		Question12 q12 = new Question12();
		q12.checkAge(-12);
	}
}
