/*
20. Check if two different StringBuffer objects with the same content are equal. 
 */

package dec.java.string.buffer.pkg;

public class Question20 
{
	void chekContent()
	{
		StringBuffer sb1 = new StringBuffer("Hello");
		StringBuffer sb2 = new StringBuffer("Hello");
		
		boolean result = sb1.toString().equals(sb2.toString());
		System.out.println(result);
	}
	public static void main(String[] args) 
	{
		Question20 q20 = new Question20();
		q20.chekContent();
	}
}
