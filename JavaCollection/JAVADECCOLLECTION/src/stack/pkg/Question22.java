/*
22. Write a Java program that implements a stack and find elements that are in the 
first stack but not in the second stack.

 */

package stack.pkg;

import java.util.Stack;

public class Question22
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
		
		Stack<Integer> t2 = new Stack<Integer>();
		t2.push(100);
		t2.push(65);
		t2.push(123);
		
		System.out.println(t2);
		
		Stack<Integer> result = new Stack<Integer>();
		
		for(Integer n1 : t1)
		{
			boolean found = false;
			for(Integer n2 : t2)
			{
				if(n1 == n2)
				{
					found = true;
					break;
				}
			}
			if(!found)
			{
				result.push(n1);
			}
		}
		
		System.out.println(result);
	}
}
