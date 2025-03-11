/*
6. Reverse the StringBuffer "Hello".
 */

package dec.java.string.buffer.pkg;

public class Question6 
{
	void reverse()
	{
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb.reverse());
	}
	public static void main(String[] args) 
	{
		Question6 q6 = new Question6();
		q6.reverse();
	}
}
