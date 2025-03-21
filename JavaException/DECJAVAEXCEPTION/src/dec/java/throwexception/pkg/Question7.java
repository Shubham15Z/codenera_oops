/*
 7. Throw StringIndexOutOfBoundsException for an invalid string index.  
 */

package dec.java.throwexception.pkg;

public class Question7 
{
	void StringIndex()
	{
		String s1 = "HelloJava";
		int index = 15;
		if(index > s1.length())
		{
			throw new StringIndexOutOfBoundsException("please check the string index");
		}
		
		
		System.out.println(s1.charAt(index));
	}
	
	public static void main(String[] args) {
		Question7 q7 = new Question7();
		q7.StringIndex();
	}
}
