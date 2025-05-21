/*
1. Basic Operations with LinkedHashSet
   Write a program to:
   - Add elements to a LinkedHashSet.
   - Remove elements.
   - Iterate over the set to print all elements in insertion order.
 */


package linkedhashset.practice1.pkg;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Question1 
{
	public static void main(String[] args) 
	{
		Set set1 = new LinkedHashSet<>();
		set1.add(10);
		set1.add(30);
		set1.add(1);
		set1.add(12);
		set1.add(30);
		set1.add(9);
		set1.add(80);
		set1.add(2);
		
		set1.remove(12);
		set1.remove(80);
		
		Iterator itr = set1.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
