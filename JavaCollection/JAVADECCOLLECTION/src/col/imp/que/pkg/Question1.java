/*
1. Remove Duplicates  
   - Question: Given an ArrayList of integers, remove duplicates while preserving order.
   - Input: [1, 2, 2, 3, 4, 4, 5]
   - Output: [1, 2, 3, 4, 5]
 */

package col.imp.que.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1 
{
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5));
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(int num : list1)
		{
			if(!list2.contains(num))
			{
				list2.add(num);
			}
		}
		System.out.println("After removing duplicates : "+list2);
	}
}
