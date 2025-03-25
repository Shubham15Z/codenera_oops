/*
8. Create a program that attempts to parse an invalid double value using Double.parseDouble() and handles the exception.  
 */

package dec.java.throwskeyword.pkg;

public class Question8 
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
		
	}
	
	public static void main(String[] args) 
	{
		Question8 q8 = new Question8();
		q8.m1();
	}
}
