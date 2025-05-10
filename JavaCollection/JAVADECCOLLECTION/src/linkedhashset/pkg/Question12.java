/*
12.Merge two LinkedHashSets into a third set and display the result without duplicates.
 */

package linkedhashset.pkg;

import java.util.LinkedHashSet;

public class Question12 
{
	public static void main(String[] args) 
	{
		LinkedHashSet l1 = new LinkedHashSet();
		l1.add(30);
		l1.add(20);
		l1.add(5);
		l1.add(90);
		
		LinkedHashSet l2 = new LinkedHashSet();
		l2.add(20);
		l2.add(null);
		l2.add(2);
		
		LinkedHashSet l3 = new LinkedHashSet();
		l3.addAll(l1);
		l3.addAll(l2);
		
		System.out.println(l3);
	}
}
