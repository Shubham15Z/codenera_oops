/*
19. Write a Java program that implements a stack and checks if the stack is a subset of 
another stack.
 */

package stack.pkg;

import java.util.Stack;

public class Question19 
{
	public static void main(String[] args)
	{
		Stack t1 = new Stack();
		t1.push(10);
		t1.push(30);
		t1.push(600);
		t1.push(5);
		t1.push(65);
		
		System.out.println(t1);
		
		Stack t2 = new Stack();
		t2.push(10);
		t2.push(5);
		t2.push(600);
		
		System.out.println(t2);
		
		System.out.println(t1.containsAll(t2));
	}
}
