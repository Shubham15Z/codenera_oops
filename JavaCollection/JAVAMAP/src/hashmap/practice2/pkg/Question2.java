/*
12. Find Common Characters  
    - Question: Find common characters in two strings using a HashMap.
    - Input: "hello", "world"
    - Output: ["o", "l"]
 */

package hashmap.practice2.pkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question2 
{
	public static void main(String[] args)
	{
		String s1 = "hello";
		String s2 = "world";
		
		Map<Character, Integer> m1 = new HashMap<Character, Integer>();
		
		for(char ch : s1.toCharArray())
		{
			m1.put(ch, m1.getOrDefault(ch, 0)+1);
		}
		
		System.out.println(m1);
		
		List<Character> list1 = new ArrayList<Character>();
		
		for(char ch : s2.toCharArray())
		{
			if(m1.containsKey(ch))
			{
				list1.add(ch);
				m1.remove(ch);
			}
		}
		System.out.println(list1);		
	}
}
