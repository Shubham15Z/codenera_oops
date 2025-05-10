/*
2. Count Frequency of Words in a Sentence
   Problem Description:  
   Write a Java program to count the frequency of each word in a sentence using a HashMap.

   Input: A sentence string.  
   Output: A map showing the frequency of each word.

   Example:
   - Input: "Java is great and Java is powerful"
   - Output: {"Java": 2, "is": 2, "great": 1, "and": 1, "powerful": 1}
 */

package hashmap.pkg;

import java.util.HashMap;
import java.util.Map;

public class FrequencyDemo 
{
	public static void countStringFrequency(String s)
	{
		Map<String,Integer> m1 = new HashMap<String, Integer>();
		
		for(String word : s.split("\\s"))
		{
			if(m1.containsKey(word))
			{
				m1.put(word, m1.get(word)+1);
			}
			else
			{
				m1.put(word, 1);
			}
		}
		System.out.println(m1);
	}
	
	public static void countCharacterFrequency(String s)
	{
		Map<Character, Integer> m1 = new HashMap<Character, Integer>();
		
		for(char ch : s.toCharArray())
		{
			if(m1.containsKey(ch))
			{
				m1.put(ch, m1.get(ch)+1);
			}
			else
			{
				m1.put(ch, 1);
			}
		}
		
		System.out.println(m1);
	}
	
	public static void main(String[] args)
	{
		String s1 = "Java is great and Java is powerful";
		countStringFrequency(s1);
		
		String s2 = "Programming";
		countCharacterFrequency(s2);
	}
}
