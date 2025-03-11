/*
23. Find the last index of 'g' in the StringBuffer "Programming". 
 */

package dec.java.string.buffer.pkg;

public class Question23 
{
	void lastIndexOf()
	{
		StringBuffer sb = new StringBuffer("Programming");
	
		System.out.println(sb.lastIndexOf("g"));
	}
	public static void main(String[] args) 
	{
		Question23 q23 = new Question23();
		q23.lastIndexOf();
	}
}
