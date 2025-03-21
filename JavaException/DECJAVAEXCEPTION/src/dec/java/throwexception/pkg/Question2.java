/*
2. Throw NullPointerException if a string is null
 */

package dec.java.throwexception.pkg;

public class Question2 
{
	void nullString()
	{
		String s1 = null;
		
		if(s1 == null)
		{
			throw new NullPointerException("String is null");
		}
		
		
		System.out.println("res = "+s1);
	}
	
	public static void main(String[] args) {
		Question2 q2 = new Question2();
		q2.nullString();
	}
}
