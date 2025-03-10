/*
2. Split a comma-separated string into an array of strings and print the elements. 
 */

package dec.java.str.method.practice2.pkg;

public class Question2
{
	String sentence = "I,am,a,Spiderman,I,will,save,you";
	
	void splitWord()
	{
		String[] s1 =  sentence.split(",");
		
		for(int i = 0; i < s1.length; i++)
		{
			System.out.println(s1[i]);
		}
	}
	public static void main(String[] args)
	{
		Question2 q2 = new Question2();
		q2.splitWord();
	}
}
