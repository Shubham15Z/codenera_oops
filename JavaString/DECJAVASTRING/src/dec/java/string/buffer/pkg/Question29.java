/*
29. Check if a given StringBuffer is empty or not.
 */

package dec.java.string.buffer.pkg;

public class Question29 
{
	void checkEmpty()
	{
		StringBuffer sb = new StringBuffer("he6");
	
		System.out.println(sb.isEmpty());
	}
	public static void main(String[] args) 
	{
		Question29 q29 = new Question29();
		q29.checkEmpty();
	}
}
