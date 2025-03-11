/*
 11. Modify the character at index 0 of the StringBuffer "Java" to 'Y'.
 */

package dec.java.string.buffer.pkg;

public class Question11
{
	void modifyPrint()
	{
		StringBuffer sb = new StringBuffer("Java");
		sb.setCharAt(0,'Y');
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		Question11 q11 = new Question11();
		q11.modifyPrint();
	}
}
