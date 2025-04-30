/*
23. Write a Java program to create a vector with a specified initial capacity.
24. Implement a Java program to trim the capacity of a vector to the current size.
*/

package vector.pkg;

import java.util.Vector;

public class Question23 
{
	public static void main(String[] args) 
	{
		Vector v1 = new Vector(20);
		System.out.println(v1.capacity());
		
		v1.add(10);
		v1.add(20);
		v1.add(20);
		v1.add(30);
		
		v1.trimToSize();
		System.out.println(v1.capacity());
	}
}
