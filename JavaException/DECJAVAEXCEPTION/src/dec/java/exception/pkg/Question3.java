/*
3. Write a Java program to handle a null pointer exception.
 */

package dec.java.exception.pkg;

import java.util.Arrays;

public class Question3 
{
	void nullException()
	{
		String s1 = null;
		System.out.println(s1);
		
		try
		{
			System.out.println(s1.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		
		System.out.println("After catch block");
	}
	
	public static void main(String[] args) 
	{
		Question3 q3 = new Question3();
		q3.nullException();
	}
}
