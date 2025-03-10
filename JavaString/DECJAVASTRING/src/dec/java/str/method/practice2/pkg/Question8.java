/*
8. Split a string containing multiple delimiters (e.g., comma, semicolon, space). 
 */


package dec.java.str.method.practice2.pkg;

public class Question8
{
	String sentence = "I_am;a Spiderman,I_will; save   you";
	
	void splitWord()
	{
		String[] s1 =  sentence.split("[,;\\s]+");
		
		for(int i = 0; i < s1.length; i++)
		{
			System.out.println(s1[i]);
		}
	}
	public static void main(String[] args)
	{
		Question8 q8 = new Question8();
		q8.splitWord();
	}
}
