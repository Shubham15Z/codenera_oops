/*
7. Write a Java program to update an element in a vector at a specific index.
 */

package vector.pkg;

import java.util.Vector;

public class QUestion7
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
//		v1.add(3, false);
		v1.setElementAt(30, 2);
		v1.set(1, "Hi");
//		v1.insertElementAt("Hi", 4);
		System.out.println(v1);
	}
}
