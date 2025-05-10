/*
8. Find the Most Frequent Element in an Array
   Problem Description:  
   Write a Java program to find the most frequent element in an array using HashMap.

   Input: An array of integers.  
   Output: The most frequent element.

   Example:
   - Input: [1, 3, 2, 3, 4, 3, 5]
   - Output: 3
 */

package hashmap.practice1.pkg;

import java.util.HashMap;
import java.util.Map;

public class QUestion8 
{
	public static void findMostFrequent(int[] a)
	{
		Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
		
		for(int num : a)
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

		int maxFreq = 0;
		int mostFrequent = -1;
		
		for(int num : m1.keySet())
		{
			if(m1.get(num) > maxFreq)
			{
				maxFreq = m1.get(num);
				mostFrequent = num;
			}
		}
		
		System.out.println("Most Frequent : "+mostFrequent);
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,3,2,3,4,3,5};
		findMostFrequent(arr);
	}
}
