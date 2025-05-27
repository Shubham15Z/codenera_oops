/*
22. Find Missing Elements  
    - Question: Given an array, find elements not present in a HashSet.
    - Input: Array: [1, 2, 3, 4, 5], Set: {2, 4}
    - Output: [1, 3, 5]
 */

package col.imp.que.pkg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question22 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5};
		Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(2,4));
		
		for(int num : arr)
		{
			if(!set1.contains(num))
				System.out.print(num+" ");
		}
	}
}
