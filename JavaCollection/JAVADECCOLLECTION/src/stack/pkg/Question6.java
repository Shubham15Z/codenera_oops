/*
6. Write a Java program to remove all elements from a stack.
7. Write a Java program to count all stack elements.
8. Write a Java program to implement a stack that checks if a given element is 
present or not in the stack.
 */

package stack.pkg;

import java.util.Collections;
import java.util.Stack;

public class Question6 
{
	public static void main(String[] args)
	{
		Stack t1 = new Stack();
		t1.push(10);
		t1.push(30);
		t1.push(600);
		t1.push(5);
		t1.push(65);
		
		
		System.out.println(t1.size());
		System.out.println(t1.contains(600));
		System.out.println(t1.contains(500));
		t1.clear();
		System.out.println(t1);
	}
}
