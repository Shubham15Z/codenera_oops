/*
19. Write a Java program to remove and get a key-value mapping associated with the least key in a map.

20. Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.
 */

package treemap.pkg;

import java.util.TreeMap;

public class Question19and20 
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
		
		System.out.println(m1.pollFirstEntry());
		System.out.println(m1.pollLastEntry());
		
		System.out.println(m1);
	}
}
