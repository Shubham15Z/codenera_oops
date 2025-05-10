/*
 ArrayList

1. Remove Duplicates  
   - Question: Given an ArrayList of integers, remove duplicates while preserving order.
   - Input: [1, 2, 2, 3, 4, 4, 5]
   - Output: [1, 2, 3, 4, 5]

 */

package arraylist.practice3.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question1 
{
	public static void main(String[] args) 
	{
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,2,2,3,4,4,5));
		System.out.println(l1);
		
		List<Integer> l2 = new ArrayList<Integer>();
		for(int num : l1)
		{
			if(!l2.contains(num))
				l2.add(num);
		}
		System.out.println(l2);
	}
}
