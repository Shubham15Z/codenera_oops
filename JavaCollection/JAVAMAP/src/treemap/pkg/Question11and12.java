/*
11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.

12. Write a Java program to get the greatest key less than or equal to the given key.
 */

package treemap.pkg;

import java.util.Map;
import java.util.TreeMap;

public class Question11and12 
{
	public static void main(String[] args) 
	{
		TreeMap<String, Integer> m1 = new TreeMap<String, Integer>();
		
		m1.put("Java", 100);
		m1.put("Python", 500);
		m1.put("HTML", 300);
		m1.put("Javascript", 800);
		m1.put("C", 400);
		
		String givenKey = "I";
		
		Map.Entry<String, Integer> entry = m1.floorEntry(givenKey);
		if(entry != null)
		{
			System.out.println("Key-Value mapping (floor-entry) : "+entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("Greatest Key less than or equal (floorkey) : "+m1.floorKey(givenKey));
	}
}
