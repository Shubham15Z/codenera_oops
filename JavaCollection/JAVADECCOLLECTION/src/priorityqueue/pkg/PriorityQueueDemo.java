package priorityqueue.pkg;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo 
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
		
//		System.out.println(ob.poll());
//		System.out.println(ob.poll());
//		System.out.println(ob.poll());
		
		Iterator itr = ob.iterator();
		while(itr.hasNext())
		{
			System.out.println(ob.poll());
		}
		
	}
}
