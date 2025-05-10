package queue.pkg;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo 
{
	public static void main(String[] args) 
	{
		Queue q1 = new ArrayDeque();
		
//		System.out.println(q1.remove()); //gives exception if queue is empty.
		System.out.println(q1.poll());  // gives null 
//		System.out.println(q1.element()); // gives exception if queue is empty
		System.out.println(q1.peek()); //gives null
		
		q1.add(10);
		q1.add(50);
		q1.offer(20);
		q1.add(30);
		q1.offer(5);
		
		System.out.println(q1);
		
		System.out.println(q1.remove());
		System.out.println(q1);
		
		System.out.println(q1.poll());
		System.out.println(q1);
		
		System.out.println(q1.element());
		System.out.println(q1);
		
		System.out.println(q1.peek());
		System.out.println(q1);
	}
}
