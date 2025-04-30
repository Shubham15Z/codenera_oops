package stack.pkg;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackDemo 
{
	public static void main(String[] args)
	{
		Stack t1 = new Stack();
		t1.add(10);
		t1.push(20);
		t1.push(30);
		t1.push(40);
		t1.add(50);
		
		System.out.println(t1);
		
//		ListIterator itr = t1.listIterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.print(itr.next()+" ");
//		}
//		System.out.println();
//		while(!t1.isEmpty())
//		{
//			System.out.print(t1.pop()+" ");
//		}
		
		System.out.println("\n"+t1.pop());
		System.out.println(t1.pop());
		
		System.out.println("--------------------");
		System.out.println(t1.peek());
		System.out.println(t1.peek());
		System.out.println("--------------------");

		System.out.println(t1.pop());
		System.out.println(t1.pop());
		System.out.println(t1.pop());
	}
}
