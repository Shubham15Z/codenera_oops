/*
11. Split a string of words and count the frequency of each unique word.
 */

package dec.java.str.method.practice2.pkg;

public class Question11 
{
	String sentence = "I am a Spiderman I will save you if you follow me";
	
	void splitWord()
	{
		String[] s1 =  sentence.split(" ");
		
		for(int i = 0; i < s1.length; i++)
		{
			int freq = 1;
			for(int j = i+1; j < s1.length; j++)
			{
				if(s1[i].equals(s1[j]))
				{
					freq++;
					s1[j] = "-1";
				}
			}
			if(s1[i] != "-1")
				System.out.println("Frequency of "+s1[i]+" : "+freq);
		}
	}
	public static void main(String[] args)
	{
		Question11 q11 = new Question11();
		q11.splitWord();
	}
}
