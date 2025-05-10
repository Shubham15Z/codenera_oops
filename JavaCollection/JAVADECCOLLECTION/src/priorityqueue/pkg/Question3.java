/*
3. Write a Java program to add all the elements of a priority queue to another priority queue.
4. Write a Java program to insert a given element into a priority queue.
 */

package priorityqueue.pkg;

import java.util.PriorityQueue;

public class Question3 
{
	public static void main(String[] args) 
	{
		PriorityQueue ob = new PriorityQueue();
		
		ob.add(20);
		ob.add(40);
		ob.add(10);
		ob.add(80);
		ob.add(35);
		
		int num = 10;
		PriorityQueue q2 = new PriorityQueue();
		q2.addAll(ob);
		q2.add(num);
;		
		System.out.println(q2);
	}
}
