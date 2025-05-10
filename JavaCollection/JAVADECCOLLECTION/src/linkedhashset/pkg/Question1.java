/*
1. Create a LinkedHashSet of Strings and add five elements. Print all elements.
2.Demonstrate insertion order with LinkedHashSet by adding elements in a specific order and printing them.
 */
package linkedhashset.pkg;

import java.util.LinkedHashSet;

public class Question1 
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> l1 = new LinkedHashSet<String>();
		
		l1.add("Yellow");
		l1.add("Green");
		l1.add("Pink");
		l1.add("Black");
		l1.add("Orange");
		
//		System.out.println(l1);
		
		LinkedHashSet l2 = new LinkedHashSet();
		l2.add(30);
		l2.add(20);
		l2.add(5);
		l2.add(90);
		l2.add(20);
		l2.add(null);
		l2.add(2);
		
		System.out.println(l2);
		
	}
}
