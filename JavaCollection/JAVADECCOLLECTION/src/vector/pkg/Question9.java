/*
9. Create a program to remove all elements from a vector using the clear() method.
 */

package vector.pkg;

import java.util.Vector;

public class Question9 
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
		v1.clear();
		System.out.println(v1);
	}
}
