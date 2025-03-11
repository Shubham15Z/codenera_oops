/*
21. Create a StringBuffer with a long sentence and replace all spaces with '-'. 
 */

package dec.java.string.buffer.pkg;

public class Question21 
{
	void replaceSpace()
	{
		StringBuffer sb = new StringBuffer("Hi, this is Spiderman and he is here to save you");
	
		for(int i = 0; i < sb.length()-1; i++)
		{
			if(sb.charAt(i) == ' ')
			{
				sb.setCharAt(i, '-');
			}
		}
		
		System.out.println(sb);
	}
	public static void main(String[] args) 
	{
		Question21 q21 = new Question21();
		q21.replaceSpace();
	}
}
