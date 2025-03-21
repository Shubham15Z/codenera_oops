/*
2. Write a Java program to handle an array index out-of-bounds exception.
 */

package dec.java.exception.pkg;

import java.util.Arrays;

public class Question2 
{
	void arrayIndex()
	{
		int[] a1 = {3,5,8,5};
		System.out.println(Arrays.toString(a1));
		
		try
		{
			System.out.println(a1[8]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		System.out.println("After catch block");
	}
	
	public static void main(String[] args) 
	{
		Question2 q2 = new Question2();
		q2.arrayIndex();
	}
}
