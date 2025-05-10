/*
15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.

16. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key.
 Return null if there is no such key.
 
17. Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.
 */

package treemap.pkg;

import java.util.Map;
import java.util.TreeMap;

public class Question15_16and17 
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
		
		String givenKey="Java";
		System.out.println("Least Key Strictly greater than given key : "+m1.higherKey(givenKey));
		
		Map.Entry<String, Integer> entry = m1.lowerEntry(givenKey);
		System.out.println(entry);
		
		System.out.println("Greatest key Strictly lower than gievn key : "+m1.lowerKey(givenKey));
	}
}
