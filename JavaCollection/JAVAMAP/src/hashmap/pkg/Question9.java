/*
9. Write a Java program to create a set view of the mappings contained in a map.

10. Write a Java program to get the value of a specified key in a map.

12. Write a Java program to get a collection view of the values contained in this map
 */

package hashmap.pkg;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Question9 
{
	public static void main(String[] args)
	{
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		
		m1.put("java", 70);
		m1.put("python", 50);
		m1.put("react", 40);
		m1.put("javascript", 30);
		m1.put("javascript", 30);
		m1.put("angular", 40);
		
		System.out.println(m1);
		
		Set s1 = m1.keySet();
		System.out.println("Set of keys :"+s1);
		
		Collection values =  m1.values();
		System.out.println("Collection of values : "+values);
		
		String key1 = "react";
		System.out.println(key1+" : "+m1.get(key1));
		
	}
}
