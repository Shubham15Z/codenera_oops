/*
12. Find Common Characters  
    - Question: Find common characters in two strings using a HashMap.
    - Input: "hello", "world"
    - Output: ["o", "l"]
 */

package col.imp.que.pkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question12 
{
	public static void main(String[] args) 
	{
		String s1 = "hello";
		String s2 = "world";
		
		Map<Character, Integer> m1 = new HashMap<Character, Integer>();
		
		List<Character> list1 = new ArrayList<Character>();
		
		for(char ch : s1.toCharArray())
		{
			m1.put(ch, m1.getOrDefault(ch, 0)+1);
		}
		
		for(char ch : s2.toCharArray())
		{
			if(m1.containsKey(ch) && !list1.contains(ch))
			{
				list1.add(ch);
			}
		}
		
		System.out.println(list1);
	}
}
