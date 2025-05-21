/*
7. Word Count with LinkedHashSet
   Given a paragraph, write a program to count the number of unique words, 
   maintaining the insertion order using LinkedHashSet.
 */

package linkedhashset.practice1.pkg;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Question7 
{
	public static void main(String[] args) 
	{
		String para = "learning and learning every day helps improve skills Skills grow with practice and practice makes learning more effective daily";
		String[] words = para.split(" ");
		
		System.out.println(Arrays.toString(words));
		System.out.println(words.length);
		Set<String> uniqueWords = new LinkedHashSet<String>();
		
		for(String s1 : words)
		{
			uniqueWords.add(s1);
		}
		
		System.out.println("Count of Unique words : "+uniqueWords.size());
	}
}
