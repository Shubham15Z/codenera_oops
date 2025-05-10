/*
7.Create a LinkedHashSet and prevent duplicate values from being inserted. Show with an example.
 */

package linkedhashset.pkg;

import java.util.LinkedHashSet;

public class Question7 
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
		l1.add(90);
		l1.add(30);
		
		System.out.println(l1);
	}
}
