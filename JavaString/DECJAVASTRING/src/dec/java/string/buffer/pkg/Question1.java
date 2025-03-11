/*
1. Create a StringBuffer with the text "Hello" and print it.
 */

package dec.java.string.buffer.pkg;

public class Question1 
{
	void print()
	{
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		Question1 q1 = new Question1();
		q1.print();
	}
}
