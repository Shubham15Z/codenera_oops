/*
7. Write a Java program to sort keys in a Tree Map by using a comparator.
 */

package treemap.pkg;

import java.util.Comparator;
import java.util.TreeMap;

class SortKey implements Comparator
{
	public int compare(Object o1, Object o2) {
		if(o1.toString().compareTo(o2.toString()) > 0)
			return -1;
		else if(o1.toString().compareTo(o2.toString()) < 0)
			return 1;
		else
			return 0;	
	}
}
public class Question7 
{
	public static void main(String[] args)
	{
		TreeMap<String, Integer> m1 = new TreeMap<String, Integer>(new SortKey());
		
		m1.put("Java", 100);
		m1.put("Python", 500);
		m1.put("HTML", 300);
		m1.put("Javascript", 800);
		m1.put("C", 400);
		
		System.out.println("Descending sort on Keys :\n"+m1);
	}
}
