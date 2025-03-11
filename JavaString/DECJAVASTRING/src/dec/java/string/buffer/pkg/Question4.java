/*
 4. Replace "World" with "Java" in the StringBuffer "Hello World".
 */

package dec.java.string.buffer.pkg;

public class Question4 
{
	void replace()
	{
		StringBuffer sb = new StringBuffer("Hello World");
		sb.replace(6,11, "Java");
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		Question4 q4 = new Question4();
		q4.replace();
	}
}
