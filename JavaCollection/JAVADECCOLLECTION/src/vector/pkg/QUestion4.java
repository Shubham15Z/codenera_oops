/*
 4. Create a Java program to remove an element from a vector by its index.
 */

package vector.pkg;

import java.util.Vector;

public class QUestion4 
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
		
		System.out.println(v1);
		
		v1.remove(2);
		System.out.println(v1);
	}
}
