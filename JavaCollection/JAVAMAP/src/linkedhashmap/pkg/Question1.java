/*
1. Write a Java program to associate the specified value with the specified key in a LinkedHash Map.
 */
package linkedhashmap.pkg;

import java.util.LinkedHashMap;
import java.util.Map;

public class Question1 
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
		
		System.out.println(m1);
		
		for(Map.Entry<Integer, Integer> entry : m1.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
