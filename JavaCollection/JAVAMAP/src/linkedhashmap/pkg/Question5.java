/*
5. Write a Java program to get all keys from a  LinkedHash Map.
 */

package linkedhashmap.pkg;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Question5 
{
	public static void main(String[] args) 
	{
		Map<Integer, Integer> m1 = new LinkedHashMap<Integer, Integer>();
		
		m1.put(10, 38);
		m1.put(20, 69);
		m1.put(15, 53);
		m1.put(40, 76);
		m1.put(25, 69);
		m1.put(15, 93);
		
		Set<Integer> s1 = m1.keySet();
		System.out.println(s1);
		
		m1.clear();
		System.out.println(m1);
	}
	
}
