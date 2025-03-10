/*
Split a string based on uppercase letters (e.g., "HelloWorld" → ["Hello", "World"]). 
*/

package dec.java.str.method.practice2.pkg;

import java.util.Arrays;

public class Question9 
{
	String sentence = "IAmASpidermanIWillSaveYou";
	
	void splitWord()
	{
		String[] s1 =  sentence.split("(?=[A-Z])");
		System.out.println(Arrays.toString(s1));
		
		for(int i = 0; i < s1.length; i++)
		{
			System.out.println(s1[i]);
		}
	}
	public static void main(String[] args)
	{
		Question9 q9 = new Question9();
		q9.splitWord();
	}
}
