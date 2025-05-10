/*
9. Sort a Stack  
   - Question: Sort a stack in ascending order using another stack.
   - Input: [3, 1, 4, 2]
   - Output: [1, 2, 3, 4]
 */

package stack.practice2.pkg;

import java.util.Stack;

public class Question4 
{
	public static void main(String[] args)
	{
		Stack<Integer> st1 = new Stack<Integer>();
		st1.push(3);
		st1.push(1);
		st1.push(4);
		st1.push(2);
		System.out.println(st1);
		
		Stack<Integer> st2 = new Stack<Integer>();
		
		while(!st1.isEmpty())
		{
			int temp = st1.pop();
			
			while(!st2.isEmpty() && st2.peek() > temp)
			{
				st1.push(st2.pop());
			}
			
			st2.push(temp);
		}
		System.out.println(st1);
		System.out.println(st2);
	}
}
