/*
 1. Split a given sentence into words and print each word on a new line.  
 */
package dec.java.str.method.practice2.pkg;

public class Question1 
{	
	String sentence = "I am a Spiderman I will save you";
	
	void splitWord()
	{
		String[] s1 =  sentence.split(" ");
		
		for(int i = 0; i < s1.length; i++)
		{
			System.out.println(s1[i]);
		}
	}
	public static void main(String[] args)
	{
		Question1 q1 = new Question1();
		q1.splitWord();
	}
}
