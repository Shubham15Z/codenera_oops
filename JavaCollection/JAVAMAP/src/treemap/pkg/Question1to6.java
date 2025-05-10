/*
1. Write a Java program to associate the specified value with the specified key in a Tree Map.

2. Write a Java program to copy Tree Map's content to another Tree Map.

3. Write a Java program to search for a key in a Tree Map.

4. Write a Java program to search for a value in a Tree Map.

5. Write a Java program to get all keys from a Tree Map.

6. Write a Java program to delete all elements from a Tree Map.
 */

package treemap.pkg;

import java.util.Set;
import java.util.TreeMap;

public class Question1to6 
{
	public static void main(String[] args)
	{
		TreeMap<String, Integer> m1 = new TreeMap<String, Integer>();
		
		m1.put("Java", 100);
		m1.put("Python", 500);
		m1.put("HTML", 300);
		m1.put("Javascript", 800);
		m1.put("C", 400);
		
		System.out.println(m1);
		
		TreeMap<String, Integer> m2 = new TreeMap<String, Integer>(m1);
		
		System.out.println(m2);
		
		String key = "HTML";
		int value = 500;
		System.out.println(key+" : "+m1.containsKey(key));
		System.out.println(value+" : "+m1.containsValue(value));
		
		Set<String> s1 = m1.keySet();
		System.out.println("All key :"+s1);
		
		m2.clear();
		System.out.println(m2);
	}
}
