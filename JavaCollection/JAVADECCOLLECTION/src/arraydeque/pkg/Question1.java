/*
1. Basic Operations with ArrayDeque
   Write a program to perform the following operations using ArrayDeque:
   - Add elements to the front and back of the deque.
   - Remove elements from both ends.
   - Print the final state of the deque.
 */

package arraydeque.pkg;

import java.util.ArrayDeque;

public class Question1
{
	public static void main(String[] args) 
	{
		ArrayDeque q1 = new ArrayDeque();
		q1.add(10);
		q1.add(20);
		q1.add(30);
		
		System.out.println(q1);
		
		q1.addFirst(40);
		System.out.println(q1);
		
		q1.addLast(50);
		System.out.println(q1);
		
		q1.removeFirst();
		System.out.println(q1);
		
		q1.removeLast();
		System.out.println(q1);
	
	}
}
