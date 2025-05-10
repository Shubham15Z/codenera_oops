/*
14. Top K Frequent Elements  
    - Question: Find the top k frequent elements in an array.
    - Input: [1, 1, 1, 2, 2, 3], k = 2
    - Output: [1, 2]
 */

package hashmap.practice2.pkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question4 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,1,1,2,2,3};
		int k = 2;
		
		Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
		
		for(int num : arr)
		{
			m1.put(num, m1.getOrDefault(num, 0)+1);
		}
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		System.out.println(m1);
		
		for(int num : m1.keySet())
		{
			if(m1.get(num) >= k)
			{
				list1.add(num);
			}
		}
		
		System.out.println(list1);
	}
}
