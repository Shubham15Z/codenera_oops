/*
15. Append a float 45.67 to a StringBuffer "Value: " and print the result. 
 */
package dec.java.string.buffer.pkg;

public class Question15 
{
	void appendFloat()
	{
		StringBuffer sb = new StringBuffer("Value: ");
		sb.append(45.67);
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		Question15 q15 = new Question15();
		q15.appendFloat();
	}
}
