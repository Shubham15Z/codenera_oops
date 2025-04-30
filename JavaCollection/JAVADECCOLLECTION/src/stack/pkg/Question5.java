/*
5. Write a Java program to find the maximum and minimum elements in a stack.
 */

package stack.pkg;

import java.util.Collections;
import java.util.Stack;

public class Question5
{
	public static void main(String[] args)
	{
		Stack t1 = new Stack();
		t1.push(10);
		t1.push(30);
		t1.push(600);
		t1.push(5);
		t1.push(65);
		
		System.out.println(Collections.max(t1));
		System.out.println(Collections.min(t1));
	}
}
