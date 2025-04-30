/*
1. Write a Java program to create a vector and add elements to it.
 */

package vector.pkg;

import java.util.Vector;

public class Question1
{
	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		v1.add(10);
		v1.addElement("B");
		System.out.println(v1);
	}
}
