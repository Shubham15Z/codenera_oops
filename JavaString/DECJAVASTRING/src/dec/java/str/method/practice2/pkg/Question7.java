/*
7. Split a sentence into words and display the words in reverse order.
 */

package dec.java.str.method.practice2.pkg;

public class Question7 
{
	String sentence = "I am a Spiderman I will save you";
	
	void splitWord()
	{
		String[] s1 =  sentence.split(" ");
		
		for(int i = s1.length-1; i >= 0; i--)
		{
			System.out.println(s1[i]);
		}
	}
	public static void main(String[] args)
	{
		Question7 q7 = new Question7();
		q7.splitWord();
	}
}
