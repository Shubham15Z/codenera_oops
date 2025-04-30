/*
6. Implement a Java program to retrieve the first and last elements from a vector.
 */
package vector.pkg;

import java.util.Vector;

public class Question6 
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
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
	}
}
