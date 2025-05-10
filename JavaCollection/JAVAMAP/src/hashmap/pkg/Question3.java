/*
3. Write a Java program to copy all mappings from the specified map to another map.

4. Write a Java program to remove all mappings from a map.

5. Write a Java program to check whether a map contains key-value mappings (empty) or not.

6. Write a Java program to get a shallow copy of a HashMap instance.
 */

package hashmap.pkg;

import java.util.HashMap;
import java.util.Map;

public class Question3 
{
	public static void main(String[] args)
	{
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		
		m1.put("java", 70);
		m1.put("python", 50);
		m1.put("react", 90);
		m1.put("javascript", 30);
		m1.put("angular", 40);
		
		Map<String, Integer> m2 = new HashMap<String, Integer>();
		
		m2.putAll(m1);
		System.out.println(m2);
		
		m2.clear();
		System.out.println(m2);
		
		System.out.println(m1.isEmpty());
		System.out.println(m2.isEmpty());
		
		Map<String, Integer> m3 = new HashMap<String, Integer>(m1);
		System.out.println(m3);
		
		HashMap<String, Integer> m4 = (HashMap<String, Integer>) ((HashMap<String, Integer>) m1).clone();
		System.out.println(m4);
	}
}
