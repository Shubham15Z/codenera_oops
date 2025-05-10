/*
13. Write a Java program to get the portion of a map whose keys are strictly less than a given key.

14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
 */

package treemap.pkg;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Question13and14
{
	public static void main(String[] args) 
	{
		TreeMap<String, Integer> m1 = new TreeMap<String, Integer>();
		
		m1.put("Java", 100);
		m1.put("Python", 500);
		m1.put("HTML", 300);
		m1.put("Javascript", 800);
		m1.put("C", 400);	
		
		String givenKey = "Java";
		SortedMap<String, Integer> entry1 = m1.headMap(givenKey);
		System.out.println("Keys Strictly less than given key : "+entry1);
		
		SortedMap<String, Integer> entry2 = m1.headMap(givenKey, true);
		System.out.println("Keys less than given keys inclusive : "+entry2);
	}
}
