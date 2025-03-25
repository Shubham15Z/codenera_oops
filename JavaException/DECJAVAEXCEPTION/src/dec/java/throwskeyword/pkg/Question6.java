/*
6. Handle StringIndexOutOfBoundsException when accessing an invalid index of a string.  
 */

package dec.java.throwskeyword.pkg;

public class Question6 
{
	public void print() throws StringIndexOutOfBoundsException
	{
		String s1 = "hello";
		System.out.println(s1.charAt(10));
	}
	
	public void m1()
	{
		try
		{
			print();
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("StringIndexOutOfBoundsException handled....");
		}
	}
	
	public static void main(String[] args) 
	{
		Question6 q6 = new Question6();
		q6.m1();
	}
}
