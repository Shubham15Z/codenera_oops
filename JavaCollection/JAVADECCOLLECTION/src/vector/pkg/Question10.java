/*
10. Write a Java program to check if a vector is empty or not.
11. Implement a Java program to get the size of a vector.
12. Write a program to convert a vector into an array.
13. Write a Java program to copy elements from one vector to another.
 */

package vector.pkg;

import java.util.Vector;

public class Question10 
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
		
		System.out.println(v1.isEmpty());
		System.out.println(v1.size());

		Vector v2 = new Vector(v1);
		System.out.println(v2);
		
	}
}
