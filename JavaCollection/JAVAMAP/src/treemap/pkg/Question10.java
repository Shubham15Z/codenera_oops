/*
10. Write a Java program to get a reverse order view of the keys contained in a given map.
 */

package treemap.pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class Question10 
{
	public static void main(String[] args) 
	{
		TreeMap<String, Integer> m1 = new TreeMap<String, Integer>();
		
		m1.put("Java", 100);
		m1.put("Python", 500);
		m1.put("HTML", 300);
		m1.put("Javascript", 800);
		m1.put("C", 400);
		
		List<String> l1 = new ArrayList<String>(m1.keySet());
		
		System.out.println(l1);
		Collections.reverse(l1);
		System.out.println(l1);
	}
}
