/*
13. Find and print the length of the StringBuffer "Programming".
 */

package dec.java.string.buffer.pkg;

public class Question13 
{
	void findLength()
	{
		StringBuffer sb = new StringBuffer("Programming");
		
		System.out.println(sb.length());
	}
	public static void main(String[] args) 
	{
		Question13 q13 = new Question13();
		q13.findLength();
	}
}
