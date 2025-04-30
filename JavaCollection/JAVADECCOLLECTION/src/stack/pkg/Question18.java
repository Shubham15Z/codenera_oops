/*
18. Write a Java program to merge two stacks into one
 */

package stack.pkg;

import java.util.Collections;
import java.util.Stack;

public class Question18
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
		t2.push(100);
		t2.push(56);
		t2.push(123);
		
		System.out.println(t2);
		
		t1.addAll(t2);
		System.out.println(t1);
	}
}
