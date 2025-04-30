/*
8. Write a program to find the index of a specific element in a vector.
 */

package vector.pkg;

import java.util.Vector;

public class Question8 
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
		System.out.println(v1.indexOf(true));
	}
}
