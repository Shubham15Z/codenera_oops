/*
19. Convert a StringBuffer "Hello" to uppercase using String methods. 
 */

package dec.java.string.buffer.pkg;

public class Question19 
{
	void toUppercase()
	{
		StringBuffer sb = new StringBuffer("Hello");
		String s1 = new String(sb);
		s1.toUpperCase();
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
	}
	public static void main(String[] args) 
	{
		Question19 q19 = new Question19();
		q19.toUppercase();
	}
}
