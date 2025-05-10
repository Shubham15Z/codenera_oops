/*
8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
 */

package treemap.pkg;

import java.util.TreeMap;

public class Question8and9 
{
	public static void main(String[] args)
	{
		TreeMap<String, Integer> m1 = new TreeMap<String, Integer>();
		
		m1.put("Java", 100);
		m1.put("Python", 500);
		m1.put("HTML", 300);
		m1.put("Javascript", 800);
		m1.put("C", 400);
		
		System.out.println("greatest key : "+m1.lastKey()+" "+m1.get(m1.lastKey()));
		System.out.println("least key : "+m1.firstKey()+" "+m1.get(m1.firstKey()));
		
		System.out.println("First key : "+m1.firstKey()+" "+m1.get(m1.firstKey()));
		System.out.println("Last key : "+m1.lastKey()+" "+m1.get(m1.lastKey()));
		
		
	}
}
