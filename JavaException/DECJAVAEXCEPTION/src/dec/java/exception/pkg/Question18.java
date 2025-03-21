/*
18. Write a Java program that demonstrates exception handling in a constructor.  
 */

package dec.java.exception.pkg;

public class Question18 
{
	Question18()
	{
		String s1 = "123dfr";
		System.out.println(s1);
		
		try
		{
			System.out.println(Integer.parseInt(s1));
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		
		System.out.println("After catch block");
	}
	
	public static void main(String[] args) 
	{
		Question18 q18 = new Question18();

	}
}
