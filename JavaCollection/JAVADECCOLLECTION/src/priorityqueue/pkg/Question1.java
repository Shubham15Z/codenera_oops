/*
1. Write a Java program to create a priority queue, add some colors (strings)
 and print out the elements of the priority queue.
 2. Write a Java program to iterate through all elements in the priority queue.
 */

package priorityqueue.pkg;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Question1 
{
	public static void main(String[] args)
	{
		PriorityQueue<String> colors = new PriorityQueue<String>();
		
		colors.add("Yellow");
		colors.add("Red");
		colors.add("Pink");
		colors.add("Black");
		colors.add("Green");
		
		System.out.println(colors);
		
		Iterator itr = colors.iterator();
		while(itr.hasNext())
		{
			System.out.print(colors.poll()+" ");
		}
	}
}
