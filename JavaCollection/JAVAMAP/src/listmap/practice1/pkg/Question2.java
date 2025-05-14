/*
Question 2: Count the number of words in a sentence.
Write a method that takes a sentence as input and returns the count of words in the sentence. Assume that words are separated by spaces.
Use the Stream API to solve this problem.
 */

package listmap.practice1.pkg;

import java.util.ArrayList;
import java.util.List;

public class Question2 
{
	public static long countWord(String s1)
	{
		String[] words = s1.split(" ");
		List<String> list1 = new ArrayList<String>();
		
		for(String word : words)
		{
			list1.add(word);
		}
		
		return list1.stream().count();
	}
	public static void main(String[] args) 
	{
		String sentence = "Hello Java is Simple and Robust";
		long res = countWord(sentence);
		System.out.println("The count of words in sentence is : "+res);
	}
}
