/*
11. Frequency Count  
    - Question: Count the frequency of each element in an array using a HashMap.
    - Input: [1, 2, 2, 3, 3, 3]
    - Output: {1=1, 2=2, 3=3}
 */
package hashmap.practice2.pkg;

import java.util.HashMap;
import java.util.Map;

public class Question1 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,2,3,3,3,3,4};
		
		Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
		
		for(int num : arr)
		{
			if(m1.containsKey(num))
			{
				m1.put(num, m1.get(num)+1);
			}
			else
			{
				m1.put(num, 1);
			}
		}
		
		System.out.println(m1);
	}
}
