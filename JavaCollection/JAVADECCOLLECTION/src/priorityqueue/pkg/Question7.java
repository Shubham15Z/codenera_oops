/*
7. Write a Java program to compare two priority queues.
 */

package priorityqueue.pkg;

import java.util.PriorityQueue;

public class Question7 
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> ob = new PriorityQueue();
		
		ob.add(20);
		ob.add(40);
		ob.add(10);
		ob.add(80);
		ob.add(35);
		
		PriorityQueue<Integer> ob1 = new PriorityQueue();
		
		ob1.add(20);
		ob1.add(40);
		ob1.add(10);
		ob1.add(80);
		ob1.add(35);
		
		System.out.println(ob.containsAll(ob1));
		System.out.println(ob.toString().equals(ob1.toString()));
		
	}
}
