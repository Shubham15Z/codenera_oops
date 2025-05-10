/*
2. Write a Java program to copy  LinkedHash's content to another  LinkedHash Map.
 */

package linkedhashmap.pkg;

import java.util.LinkedHashMap;
import java.util.Map;

public class Question2 
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
		
		Map<Integer, Integer> m2 = new LinkedHashMap<Integer, Integer>(m1);
		
		System.out.println(m2);
	}
}
