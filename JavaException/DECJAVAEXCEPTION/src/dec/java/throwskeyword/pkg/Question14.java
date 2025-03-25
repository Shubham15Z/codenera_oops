/*
14. Write a program that catches an exception and prints both the exception message and stack trace.  
 */

package dec.java.throwskeyword.pkg;

public class Question14 
{
	public static void print() throws NumberFormatException
	{
		String s1 = "1223fdk";
		System.out.println(Double.parseDouble(s1));
	}
	
	public void m1()
	{
		try
		{
			print();
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
			System.out.println("---------------");
			e.printStackTrace();
			
		}
		
	}
	
	public static void main(String[] args) 
	{
		Question14 q14 = new Question14();
		q14.m1();
	}
}
