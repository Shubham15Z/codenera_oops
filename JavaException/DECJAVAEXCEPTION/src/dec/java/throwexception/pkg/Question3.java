/*
3. Throw IllegalArgumentException if age is negative.
 */

package dec.java.throwexception.pkg;

public class Question3 
{
	void illegalArg(int n1)
	{
		if(n1 < 0)
		{
			throw new IllegalArgumentException("Negative number is entered please check....");
		}
		System.out.println("res = "+n1);
	}
	
	public static void main(String[] args) {
		Question3 q3 = new Question3();
		q3.illegalArg(-10);
	}
}
