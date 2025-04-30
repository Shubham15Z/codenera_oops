/*
15. Write a Java program to get the nth element from the top of the stack.
 */

package stack.pkg;

import java.util.Collections;
import java.util.Stack;

public class Question15 
{
	public static void getElement(Stack<Integer> t1, int n)
	{
		if(n <= 0 || n> t1.size())
		{
			System.out.println("Invalid position");
		}
		else
		{
			int nthFromTop = t1.get(t1.size()-n);
			System.out.println(nthFromTop);
		}
			
	}
	public static void main(String[] args)
	{
		Stack<Integer> t1 = new Stack<Integer>();
		t1.push(10);
		t1.push(30);
		t1.push(600);
		t1.push(5);
		t1.push(65);
		
		int n = 2;
		getElement(t1,n);

	}
}
