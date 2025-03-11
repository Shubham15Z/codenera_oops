/*
 17. Delete characters from index 2 to 5 in the StringBuffer "HelloWorld".
 */

package dec.java.string.buffer.pkg;

public class Question17 
{
	void deleteChars()
	{
		StringBuffer sb = new StringBuffer("HelloWorld");
		sb.delete(2,5);
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		Question17 q17 = new Question17();
		q17.deleteChars();
	}
}
