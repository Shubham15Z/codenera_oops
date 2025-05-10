/*
9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
 */

package linkedhashmap.pkg;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Question9 
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
		
        Iterator<Integer> it = m1.keySet().iterator();

        Integer firstKey = null;
        Integer lastKey = null;

        if (it.hasNext()) {
            firstKey = it.next();
        }

        while (it.hasNext()) {
            lastKey = it.next();
        }
        
        System.out.println("First Key : "+firstKey);
        System.out.println("Last Key : "+lastKey);
	}
}
