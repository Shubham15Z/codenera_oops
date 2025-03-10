/*
4. Split an email address (e.g., "user@example.com") into username and domain. 
 */

package dec.java.str.method.practice2.pkg;

public class Question4 
{
	String email = "user@example.com";
	
	void splitWord()
	{
		String[] s1 =  email.split("@");
		
		System.out.println("User name is : "+s1[0]);
		System.out.println("Domain is : "+s1[1]);

	}
	public static void main(String[] args)
	{
		Question4 q4 = new Question4();
		q4.splitWord();
	}
}
