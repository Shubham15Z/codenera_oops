/*
2. Write a Java program to iterate through all elements in a hash list.
 */

package hashset.pkg;

import java.util.HashSet;
import java.util.Iterator;

public class Question2 
{
	public static void main(String[] args) 
	{
		HashSet s1 = new HashSet();
		s1.add(10);
		s1.add(50);
		s1.add(80);
		s1.add(120);
		s1.add(25);
		
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
