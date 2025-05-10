/*
4.Remove an element from a LinkedHashSet and display the result.
5.Clear all elements from a LinkedHashSet.
 */

package linkedhashset.pkg;

import java.util.LinkedHashSet;

public class Question4
{
	public static void main(String[] args) 
	{
		LinkedHashSet l1 = new LinkedHashSet();
		l1.add(30);
		l1.add(20);
		l1.add(5);
		l1.add(90);
		l1.add(20);
		l1.add(null);
		l1.add(2);
		
		System.out.println(l1.remove(5));
		
		l1.clear();
		System.out.println(l1);
		
	}
}
