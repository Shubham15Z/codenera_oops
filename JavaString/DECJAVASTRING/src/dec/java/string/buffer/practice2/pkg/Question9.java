/*
9. Write a Java program that reverses each word in an array of strings using StringBuffer and stores the 
results in another array.  

 */

package dec.java.string.buffer.practice2.pkg;

import java.util.Arrays;

public class Question9 
{
	void reverseWords(String[] s1)
	{
		String[] s2 = new String[s1.length];
		
		for(int i = 0; i < s1.length; i++)
		{
			StringBuffer sb = new StringBuffer(s1[i]);
			s2[i] = sb.reverse().toString();
		}
		
		System.out.println("Array after revesing words is : ");
		System.out.println(Arrays.toString(s2));
	}
	public static void main(String[] args) 
	{
		String[] s1 = {"Hello", "java", "is", "I", "am", "fine", "Is"};

		Question9 q9 = new Question9();
		q9.reverseWords(s1);
	}
}
