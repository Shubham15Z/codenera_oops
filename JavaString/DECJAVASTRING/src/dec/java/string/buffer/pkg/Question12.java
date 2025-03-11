/*
12. Convert a StringBuffer "Hello" to a String and print it.  
 */

package dec.java.string.buffer.pkg;

public class Question12 
{
	void convertToString()
	{
		StringBuffer sb = new StringBuffer("Hello");
		String s1 = new String(sb);
		System.out.println(s1);
	}
	public static void main(String[] args) 
	{
		Question12 q12 = new Question12();
		q12.convertToString();
	}
}
