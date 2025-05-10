/*
15. Group Anagrams  
    - Question: Group anagrams from a list of strings using a HashMap.
    - Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
    - Output: [[eat, tea, ate], [tan, nat], [bat]]
 */

package hashmap.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question5
{
	public static void main(String[] args)
	{
		String[] words = {"eat","tea","tan","ate","nat","bat"};
		
		Map<String, List<String>> m1 = new HashMap<String, List<String>>();
		
		for(String word : words)
		{
			char[] c1 = word.toCharArray();
			Arrays.sort(c1);
			String sortedKey = new String(c1);
			
			if (!m1.containsKey(sortedKey)) {
			    m1.put(sortedKey, new ArrayList<>());
			}
			m1.get(sortedKey).add(word);
		}
		List<List<String>> result = new ArrayList<>(m1.values());

	    System.out.println("Grouped Anagrams: " + result);
	}
}
