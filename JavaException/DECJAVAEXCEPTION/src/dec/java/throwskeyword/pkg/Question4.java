/*
4. Handle NullPointerException when calling a method on a null object. 
 */

package dec.java.throwskeyword.pkg;

public class Question4 
{
	public void print() throws NullPointerException
	{
		String s1 = null;
		System.out.println(s1.length());
	}
	
	public void m1()
	{
		try
		{
			print();
		}
		catch(NullPointerException e)
		{
			System.out.println("Null Pointer exception handled....");
		}
	}
	
	public static void main(String[] args) 
	{
		Question4 q4 = new Question4();
		q4.m1();
	}
}
