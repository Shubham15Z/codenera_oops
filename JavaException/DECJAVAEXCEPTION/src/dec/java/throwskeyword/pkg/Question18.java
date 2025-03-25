/*
18. Write a program that throws NullPointerException manually when a null reference is accessed.  
 */
package dec.java.throwskeyword.pkg;

public class Question18 
{
	 public static void print(int num) throws IllegalArgumentException
	 {
	        if (num < 0) 
	        {
	            throw new IllegalArgumentException();
	        }
	        else 
	        {
	            System.out.println("Number is: " +num);
	        }
	}

	public void m1() throws Exception
	{
//		print(-10);
		try
		{
			print(-10);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("print method might throws IllegalArgumentException exception...");
		}
		
	}
	
	public static void main(String[] args) throws Exception 
	{
		Question17 q17 = new Question17();
		q17.m1();
	}
}
