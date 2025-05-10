/*
1. Write a Java program to associate the specified value with the specified key in a HashMap.
2. Write a Java program to count the number of key-value (size) mappings in a map.
 */

package hashmap.pkg;

import java.util.HashMap;
import java.util.Map;

public class Question1 
{
	public static void main(String[] args)
	{
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		
		m1.put("java", 70);
		m1.put("python", 50);
		m1.put("react", 90);
		m1.put("javascript", 30);
		m1.put("angular", 40);
		
		System.out.println(m1);
		
		System.out.println("Size : "+m1.size());
		
	}
	
}
