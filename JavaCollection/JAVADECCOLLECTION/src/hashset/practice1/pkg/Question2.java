/*
22. Find Missing Elements  
    - Question: Given an array, find elements not present in a HashSet.
    - Input: Array: [1, 2, 3, 4, 5], Set: {2, 4}
    - Output: [1, 3, 5]
 */

package hashset.practice1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Question2 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		
		HashSet<Integer> h1 = new HashSet<>(Arrays.asList(2,4));
		
		List<Integer> l1 = new ArrayList<Integer>();
		
		for(int num : arr)
		{
			if(!h1.contains(num))
			{
				l1.add(num);
			}
		}
		System.out.println("Missing elements : "+l1);
	}
	
}
