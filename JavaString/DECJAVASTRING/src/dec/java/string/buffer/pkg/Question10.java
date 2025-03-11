/*
10. Retrieve and print the character at index 2 of the StringBuffer "Java".
 */

package dec.java.string.buffer.pkg;

public class Question10 
{
	void retrievePrint()
	{
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb.charAt(2));
	}
	public static void main(String[] args) 
	{
		Question10 q10 = new Question10();
		q10.retrievePrint();
	}
}
