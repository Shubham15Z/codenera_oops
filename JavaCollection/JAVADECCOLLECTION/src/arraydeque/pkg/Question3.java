/*
 3. Reverse a List
   Given a list of integers, use ArrayDeque to reverse the elements and print the reversed list.
 */

package arraydeque.pkg;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question3 
{
	public static void main(String[] args) 
	{
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(10,40,20,60,80));
		
		System.out.println(l1);
		
		ArrayDeque<Integer> q1 = new ArrayDeque<Integer>();
		
		for(Integer num : l1)
		{
//			q1.addFirst(num);
			q1.push(num);
		}
		
		System.out.println(q1);
	}
}
