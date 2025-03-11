/*
5. Delete "World" from the StringBuffer "Hello World".  
 */

package dec.java.string.buffer.pkg;

public class Question5 
{
	void delete()
	{
		StringBuffer sb = new StringBuffer("Hello World");
		sb.delete(6,11);
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		Question5 q5 = new Question5();
		q5.delete();
	}
}
