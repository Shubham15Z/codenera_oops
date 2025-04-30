/*
3. Write a Java program to sort the elements of the stack in descending order.
 */

package stack.pkg;

import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

class SortDescending implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 < o2)
			return 1;
		else if(o1 > o2)
			return -1;
		else
			return 0;
	}
}
public class Question3 
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
		Collections.sort(t1, new SortDescending());
		System.out.println(t1);
	}
}
