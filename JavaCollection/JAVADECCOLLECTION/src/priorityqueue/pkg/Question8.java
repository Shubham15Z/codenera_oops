/*
8. Write a Java program to retrieve the first element of the priority queue.
9. Write a Java program to retrieve and remove the first element.
 */

package priorityqueue.pkg;

import java.util.PriorityQueue;

public class Question8 
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
		
		System.out.println(ob.peek());
		
		System.out.println(ob.poll());
		
		System.out.println(ob);
	}
}
