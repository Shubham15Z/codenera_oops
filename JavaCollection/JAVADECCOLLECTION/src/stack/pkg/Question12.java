/*
 12. Write a Java program to rotate the stack elements in the left direction.
 */

package stack.pkg;

import java.util.Stack;

public class Question12 
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
		int temp = t1.firstElement();
		for(int i = 0; i < t1.size()-1; i++)
		{
			t1.set(i, t1.get(i+1));
		}
		t1.set(t1.size()-1, temp);
		System.out.println("Stack After Left Rotation");
		System.out.println(t1);
	}
}
