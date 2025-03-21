/*
10. Write a Java program to catch and handle a string index out-of-bounds exception. 
 */

package dec.java.exception.pkg;

public class Question10 
{
	void stringIndex()
	{
		String s1 = "HelloJava";
		System.out.println(s1);
		
		try
		{
			System.out.println(s1.charAt(90));
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		System.out.println("After catch block");
	}
	
	public static void main(String[] args) 
	{
		Question10 q10 = new Question10();
		q10.stringIndex();
	}
}
