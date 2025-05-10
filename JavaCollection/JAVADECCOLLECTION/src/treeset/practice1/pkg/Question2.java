/*
2. Write a Java program to iterate through all elements in a tree set.
 */

package treeset.practice1.pkg;

import java.util.Iterator;
import java.util.TreeSet;

public class Question2 
{
	public static void main(String[] args) 
	{
		TreeSet t1 = new TreeSet();
		t1.add(20);
		t1.add(30);
		t1.add(80);
		t1.add(15);
		t1.add(60);
		t1.add(35);
		t1.add(40);
		t1.add(55);
		
		
		System.out.println(t1);
		Iterator itr = t1.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
	}
}
