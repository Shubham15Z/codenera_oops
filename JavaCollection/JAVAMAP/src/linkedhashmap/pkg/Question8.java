/*
8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a  LinkedHash map.
 */

package linkedhashmap.pkg;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Question8 
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
		
		int maxKey = Collections.max(s1);
		System.out.println("Max Key Value : " +maxKey+" "+m1.get(maxKey));
		
		int minKey = Collections.min(s1);
		System.out.println("Min Key Value : "+minKey+" "+m1.get(minKey));
	}
}
