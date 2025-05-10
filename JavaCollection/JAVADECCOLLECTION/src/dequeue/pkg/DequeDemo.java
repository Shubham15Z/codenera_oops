package dequeue.pkg;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo 
{
	public static void main(String[] args) 
	{
		Deque ob = new ArrayDeque();
		
		ob.push(10);
		ob.push(30);
		ob.push(50);
		
		System.out.println(ob);
		ob.add(20);
		ob.offer(40);
		
		System.out.println(ob);
		
		ob.offerFirst(60);
		System.out.println(ob);
		
		ob.offerLast(80);
		System.out.println(ob);
		
		System.out.println(ob.remove());
		System.out.println(ob);
		
		
	}
}
