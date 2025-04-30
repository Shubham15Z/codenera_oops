/*
16. Write a program to find the maximum and minimum values in a vector of integers.
 */

package vector.pkg;

import java.util.Collections;
import java.util.Vector;

public class Question16 
{
	public static void main(String[] args)
	{
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.add(50);
		v1.add(30);
		v1.add(80);
		v1.add(25);
		
		System.out.println(v1);
		System.out.println(Collections.max(v1));
		System.out.println(Collections.min(v1));
	
	}
}
