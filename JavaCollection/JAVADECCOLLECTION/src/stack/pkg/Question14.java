/*
14. Write a Java program to swap the top two elements of a given stack.
 */

package stack.pkg;

import java.util.Collections;
import java.util.Stack;

public class Question14 
{
	public static void main(String[] args)
	{
		Stack<Integer> t1 = new Stack<Integer>();
		t1.push(10);
		t1.push(30);
		t1.push(600);
		t1.push(5);
		t1.push(65);
		
		System.out.println(t1);
		
		Integer temp = t1.get(1);
		t1.set(1, t1.get(2));
		t1.set(2, temp);
		
		System.out.println(t1);
	}
}
