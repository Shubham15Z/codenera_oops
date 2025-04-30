/*
17. Write a Java program to implement a stack and move the nth element from the top
 of the stack to the top.
 */

package stack.pkg;

import java.util.Stack;

public class Question17 
{
	public static void moveNthToTop(Stack<Integer> t1, int n)
	{
		if(n <= 0 || n > t1.size())
		{
			System.out.println("Invalid position");
			return;
		}
		
		Stack<Integer> temp = new Stack<Integer>();
		
		for(int i = 1; i < n; i++)
		{
			temp.push(t1.pop());
		}
		
		int nthElement = t1.pop();
		
		while(!temp.isEmpty())
		{
			t1.push(temp.pop());
		}
		
		t1.push(nthElement);
		
	}
	public static void main(String[] args)
	{
		Stack<Integer> t1 = new Stack<Integer>();
		t1.push(10);
		t1.push(30);
		t1.push(600);
		t1.push(5);
		t1.push(65);
		
		int n = 3;
		moveNthToTop(t1,n);
		
		System.out.println(t1);

	}
}
