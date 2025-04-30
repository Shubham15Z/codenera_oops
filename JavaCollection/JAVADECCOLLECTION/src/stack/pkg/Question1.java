/*
1. Write a Java program to implement a stack with push and pop operations. 
Find the top element of the stack and check if it is empty or not.
 */

package stack.pkg;

import java.util.Stack;

public class Question1 
{
	public static void main(String[] args)
	{
		Stack t1 = new Stack();
		t1.push(10);
		t1.push(20);
		t1.push(30);
		t1.push(40);
		t1.push(50);
		
		t1.pop();
		t1.pop();
		t1.pop();
		
		System.out.println(t1.peek());
		System.out.println(t1.isEmpty());
	}
}
