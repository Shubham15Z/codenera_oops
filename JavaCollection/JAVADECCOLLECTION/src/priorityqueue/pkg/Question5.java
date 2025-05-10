/*
5. Write a Java program to remove all elements from a priority queue.

6. Write a Java program to count the number of elements in a priority queue.
 */

package priorityqueue.pkg;

import java.util.PriorityQueue;

public class Question5 
{
	public static void main(String[] args)
	{
		PriorityQueue ob = new PriorityQueue();
		
		ob.add(20);
		ob.add(40);
		ob.add(10);
		ob.add(80);
		ob.add(35);
		
		System.out.println("Count : "+ob.size());
		ob.clear();
		System.out.println(ob);
	}
}
