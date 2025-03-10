/*
 6. Split a string containing numbers separated by commas and find the sum of those numbers.  
 */

package dec.java.str.method.practice2.pkg;

public class Question6 
{
	String email = "10,20,30,40,50";
	
	void splitWord()
	{
		String[] s1 =  email.split(",");
		int sum = 0;
		for(int i = 0; i < s1.length; i++)
		{
			sum = sum +Integer.parseInt(s1[i]);
		}
		
		System.out.println("Sum of numbers is : "+sum);

	}
	public static void main(String[] args)
	{
		Question6 q6 = new Question6();
		q6.splitWord();
	}
}
