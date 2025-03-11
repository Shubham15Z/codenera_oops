/*
24. Check if the StringBuffer "Java" starts with "Ja".  
 */

package dec.java.string.buffer.pkg;

public class Question24 
{
	void startsWith()
	{
		StringBuffer sb = new StringBuffer("Java");
	
		if(sb.toString().startsWith("Ja"))
			System.out.println("True");
		else
			System.out.println("False");
	}
	public static void main(String[] args) 
	{
		Question24 q24 = new Question24();
		q24.startsWith();
	}
}
