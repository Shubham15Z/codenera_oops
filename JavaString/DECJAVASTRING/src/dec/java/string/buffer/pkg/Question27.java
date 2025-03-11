/*
27. Append a substring of another String to a StringBuffer and print the result. 
 */

package dec.java.string.buffer.pkg;

public class Question27 
{
	void appendSubstring()
	{
		StringBuffer sb = new StringBuffer("Hello ");
	
		String s1 = "Java is Simple";
		
		sb.append(s1.substring(0, 4));
		
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		Question27 q27 = new Question27();
		q27.appendSubstring();
	}
}
