/*
30. Swap the first and last characters of a StringBuffer and print the modified string.
 */

package dec.java.string.buffer.pkg;

public class Question30 
{
	void swapFirstLast()
	{
		StringBuffer sb = new StringBuffer("Hello");
	
		char first = sb.charAt(0);
		char last = sb.charAt(sb.length()-1);
		
		sb.setCharAt(0, last);
		sb.setCharAt(sb.length()-1, first);
		
		System.out.println(sb);
		
	}
	public static void main(String[] args) 
	{
		Question30 q30 = new Question30();
		q30.swapFirstLast();
	}
}
