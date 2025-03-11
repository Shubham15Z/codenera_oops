/*
3. Insert "Java " at index 6 in the StringBuffer "Hello World". 
 */

package dec.java.string.buffer.pkg;

public class Question3 
{
	void insert()
	{
		StringBuffer sb = new StringBuffer("Hello World");
		sb.insert(6, "Java ");
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		Question3 q3 = new Question3();
		q3.insert();
	}
}
