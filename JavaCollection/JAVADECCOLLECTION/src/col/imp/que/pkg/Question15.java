/*
15. Group Anagrams  
    - Question: Group anagrams from a list of strings using a HashMap.
    - Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
    - Output: [[eat, tea, ate], [tan, nat], [bat]]
 */

package col.imp.que.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question15 
{
	public static void main(String[] args) 
	{
		List<String> list1 = new ArrayList<String>(Arrays.asList("eat","tea","tan","ate","nat","bat"));
		
		Map<String, List<String>> m1 = new HashMap<String, List<String>>();
		
		for(String s1 : list1)
		{
			char[] ch1 = s1.toCharArray();
			Arrays.sort(ch1);
			String sorted = new String(ch1);
			
			if(!m1.containsKey(sorted))
			{
				m1.put(sorted, new ArrayList<String>());
			}
			m1.get(sorted).add(s1);
		}
		List<List<String>> l2 = new ArrayList<>(m1.values());
		System.out.println(l2);
	}
}
