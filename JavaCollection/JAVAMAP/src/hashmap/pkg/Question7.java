/*
7. Write a Java program to test if a map contains a mapping for the specified key.

8. Write a Java program to test if a map contains a mapping for the specified value.
 */

package hashmap.pkg;

import java.util.HashMap;
import java.util.Map;

public class Question7 
{
	public static void main(String[] args)
	{
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		
		m1.put("java", 70);
		m1.put("python", 50);
		m1.put("react", 90);
		m1.put("javascript", 30);
		m1.put("angular", 40);
		
		System.out.println(m1.containsKey("react"));
		System.out.println(m1.containsValue(90));
		System.out.println(m1.containsValue(900));
		
	}
}
