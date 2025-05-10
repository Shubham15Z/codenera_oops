/*
10. Write a Java program to get a reverse order view of the keys contained in a given map.
 */

package linkedhashmap.pkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Question10 
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
		List<Integer> l1 = new ArrayList<Integer>(s1);
		
		Collections.reverse(l1);
		
		System.out.println(l1);

	}
}
