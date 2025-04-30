/*
2. Implement a Java program to iterate through all elements in a vector using an iterator.
 */

package vector.pkg;

import java.util.Iterator;
import java.util.Vector;

public class Question2 
{
	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		v1.add(10);
		v1.addElement("B");
		v1.add(20);
		v1.add(true);
		v1.add('D');
		v1.add(14.56);
		
		Iterator itr = v1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
