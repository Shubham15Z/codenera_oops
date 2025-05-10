/*
10. Write a Java program to convert a priority queue to an array containing all its elements.

11. Write a Java program to convert a Priority Queue element to string representations.
 */

package priorityqueue.pkg;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Question10 
{
	public static void main(String[] args) 
	{
		PriorityQueue ob = new PriorityQueue();
		
		ob.add(20);
		ob.add(40);
		ob.add(10);
		ob.add(80);
		ob.add(35);
		
		System.out.println(ob);	
		
		Object arr[] = ob.toArray();
		System.out.println(Arrays.toString(arr));
		
		System.out.println(ob.toString());
		
	}
}
