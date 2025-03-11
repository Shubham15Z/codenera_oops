/*
16. Insert a boolean value true at index 5 in the StringBuffer "Java Rocks". 
 */

package dec.java.string.buffer.pkg;

public class Question16 
{
	void insertBoolean()
	{
		StringBuffer sb = new StringBuffer("Java Rocks");
		sb.insert(5, true);
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		Question16 q16 = new Question16();
		q16.insertBoolean();
	}
}
