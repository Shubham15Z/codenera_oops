/*
14. Create a program to sort a vector of integers in ascending order.
15. Write a program to reverse the elements in a vector.
16. Write a program to find the maximum and minimum values in a vector of integers.
 */

package vector.pkg;

import java.util.Collections;
import java.util.Vector;

public class Question14 
{
	public static void main(String[] args) 
	{
		Vector<Integer> v1 = new Vector<Integer>();
		v1.add(10);
		v1.add(50);
		v1.add(20);
		v1.add(4);
		v1.add(35);
		v1.add(23);
		
		System.out.println(v1);
		
		System.out.println(v1.reversed());
		Collections.sort(v1);
		System.out.println(v1.reversed());
		System.out.println(v1);
		
		System.out.println("Min :"+v1.getFirst());
		System.out.println("Max :"+v1.getLast());
		
		
	}
}
