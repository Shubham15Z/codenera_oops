/*
2. Append " World" to a StringBuffer containing "Hello" and print the result. 
 */

package dec.java.string.buffer.pkg;

public class Question2 
{
	void append()
	{
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World");
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		Question2 q2 = new Question2();
		q2.append();
	}
}
