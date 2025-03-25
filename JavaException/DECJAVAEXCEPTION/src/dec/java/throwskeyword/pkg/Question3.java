/*
 3. Write a program that catches NumberFormatException when converting a non-numeric string into an integer.  
 */

package dec.java.throwskeyword.pkg;

public class Question3 
{
	public static void print() throws NumberFormatException
	{
		String s1 = "1223fdk";
		System.out.println(Integer.parseInt(s1));
	}
	
	public void m1()
	{
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
		Question3 q3 = new Question3();
		q3.m1();
	}
}
