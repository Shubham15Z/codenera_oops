/*
18. Write a Java program to get a NavigableSet view of keys in a map.
 */

package treemap.pkg;

import java.util.NavigableSet;
import java.util.TreeMap;

public class Question18 
{
	public static void main(String[] args)
	{
		TreeMap<String, Integer> m1 = new TreeMap<String, Integer>();
		
		m1.put("Java", 100);
		m1.put("Python", 500);
		m1.put("HTML", 300);
		m1.put("Javascript", 800);
		m1.put("C", 400);
		
		NavigableSet<String> keys = m1.navigableKeySet();
		System.out.println(keys);
	}
}
