/*
3. Split a string by spaces and count the number of words. 
 */

package dec.java.str.method.practice2.pkg;

public class Question3 
{
	String sentence = "I am a Spiderman I will save you";
	
	void splitWord()
	{
		String[] s1 =  sentence.split(" ");
		System.out.println("The count of words is : "+s1.length);
	}
	public static void main(String[] args)
	{
		Question3 q3 = new Question3();
		q3.splitWord();
	}
}
