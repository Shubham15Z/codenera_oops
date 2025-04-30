/*
11. Write a Java program to rotate the stack elements to the right direction.
 */

package stack.pkg;

import java.util.Collections;
import java.util.Stack;

public class Question11 
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
		int temp = t1.lastElement();
		for(int i = t1.size()-1; i >= 1; i--)
		{
			t1.set(i, t1.get(i-1));
		}
		t1.set(0, temp);
		System.out.println("Stack After Right Rotation");
		System.out.println(t1);
	}
}
