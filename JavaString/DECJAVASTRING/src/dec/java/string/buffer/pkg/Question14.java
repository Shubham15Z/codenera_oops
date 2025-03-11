/*
14. Append an integer 123 to a StringBuffer "Number: " and print the result.
 */

package dec.java.string.buffer.pkg;

public class Question14 
{
	void appendNumber()
	{
		StringBuffer sb = new StringBuffer("Number: ");
		sb.append(123);
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		Question14 q14 = new Question14();
		q14.appendNumber();
	}
}
