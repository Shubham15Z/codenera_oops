/*
6.Iterate through a LinkedHashSet using both for-each loop and iterator.
 */

package linkedhashset.pkg;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Question6 
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
		
		System.out.println(l1);
		
		Iterator itr = l1.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		
		System.out.println();
		for(Object n1 : l1)
		{
			System.out.print(n1+" ");
		}
	}
}
