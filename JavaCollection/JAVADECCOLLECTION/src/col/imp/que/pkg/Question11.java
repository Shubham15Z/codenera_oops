/*
11. Frequency Count  
    - Question: Count the frequency of each element in an array using a HashMap.
    - Input: [1, 2, 2, 3, 3, 3]
    - Output: {1=1, 2=2, 3=3}
 */

package col.imp.que.pkg;

import java.util.HashMap;
import java.util.Map;

public class Question11 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,2,3,3,3};
		
		Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
		
		for(int num : arr)
		{
			m1.put(num, m1.getOrDefault(num, 0)+1);
		}
		
		System.out.println(m1);
	}
}
