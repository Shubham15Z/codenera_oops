/*
Group Anagrams
Input: ["eat","tea","tan","ate","nat","bat"]

Output: [["eat","tea","ate"], ["tan","nat"], ["bat"]]
 */

package hashmap.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroup
{
	public static void main(String[] args)
	{
		List<String> list = List.of("eat","tea","tan","ate","nat","bat");
		
		System.out.println(list);
		
		Map<String, List<String>> m1 = new HashMap<String, List<String>>();
		
		for(String word : list)
		{
			char[] w1 = word.toCharArray();
			Arrays.sort(w1);
			String sortedWord = new String(w1);
			System.out.println(sortedWord);
			
			if(!m1.containsKey(sortedWord))
			{
				m1.put(sortedWord, new ArrayList<String>());
			}
			m1.get(sortedWord).add(word);
		}
		
		System.out.println(m1);
	}
}
