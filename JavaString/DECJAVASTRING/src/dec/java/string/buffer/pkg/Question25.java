/*
25. Convert a StringBuffer to a character array and print each character separately. 
 */

package dec.java.string.buffer.pkg;

public class Question25 
{
	void charArray()
	{
		StringBuffer sb = new StringBuffer("HelloWorld");
	
		char[] ch = sb.toString().toCharArray();
		
		for(char c1 : ch)
		{
			System.out.print(c1+" ");
		}
	}
	public static void main(String[] args) 
	{
		Question25 q25 = new Question25();
		q25.charArray();
	}
}
