/*
 * 10. Split a full name (first, middle, last) and print each part separately.
 */

package dec.java.str.method.practice2.pkg;

public class Question10 
{
	String fullname = "Rahul Singh Roy";
	
	void splitWord()
	{
		String[] s1 =  fullname.split(" ");
		
		for(int i = 0; i < s1.length; i++)
		{
			System.out.println(s1[i]);
		}
	}
	public static void main(String[] args)
	{
		Question10 q10 = new Question10();
		q10.splitWord();
	}
}
