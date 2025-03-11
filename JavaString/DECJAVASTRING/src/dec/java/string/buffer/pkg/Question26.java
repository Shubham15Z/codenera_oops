/*
26. Convert a StringBuffer containing a number "12345" into an integer.  
 */

package dec.java.string.buffer.pkg;

public class Question26
{
	void bufferToInteger()
	{
		StringBuffer sb = new StringBuffer("12345");
	
		int n1 = Integer.parseInt(sb.toString()); 
		
		System.out.println(n1);
	}
	public static void main(String[] args) 
	{
		Question26 q26 = new Question26();
		q26.bufferToInteger();
	}
}
