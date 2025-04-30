/*
18. Write a Java program to merge two vectors into a single vector.
 */

package vector.pkg;

import java.util.Vector;

public class Question18 
{
	public static void main(String[] args)
	{
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.add(50);
		v1.add(30);
		v1.add(80);
		v1.add(25);
		
		Vector<Integer> v2 = new Vector<Integer>();
		v2.add(10);
		v2.add(50);
		v2.add(30);
		
		System.out.println(v1.addAll(v2));
		System.out.println(v1);
	}
}
