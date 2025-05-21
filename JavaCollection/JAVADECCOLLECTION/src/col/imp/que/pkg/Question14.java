/*
14. Top K Frequent Elements  
    - Question: Find the top k frequent elements in an array.
    - Input: [1, 1, 1, 2, 2, 3], k = 2
    - Output: [1, 2]
 */


package col.imp.que.pkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question14 
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
		
		List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(m1.entrySet());
		entryList.sort((l1, l2) -> l2.getValue() - l1.getValue());
		
		System.out.println(entryList);
		
		List<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < k && i < entryList.size(); i++)
		{
			result.add(entryList.get(i).getKey());
		}
		
		System.out.println(result);
		
		
	}
}
