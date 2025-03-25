/*
11. Write a program where a finally block executes after an exception occurs. 
 */

package dec.java.throwskeyword.pkg;

public class Question11 
{
	public static void print() throws NumberFormatException
	{
		String s1 = "1223fdk";
		System.out.println(Double.parseDouble(s1));
	}
	
	public void m1()
	{
//		print();
		try
		{
			print();
		}
		catch(NumberFormatException e)
		{
			System.out.println("print method might throws NumberFormatException...");
		}
		finally 
		{
			System.out.println("Finally block executes");
		}
		
	}
	
	public static void main(String[] args) 
	{
		Question11 q11 = new Question11();
		q11.m1();
	}
}
