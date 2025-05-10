/*
5. Find Pairs with Given Sum in an Array
   Problem Description:  
   Write a Java program to find all pairs of integers in an array that sum up to a specific value using a HashMap.

   Input: An array of integers and a target sum.  
   Output: A list of pairs of integers whose sum equals the target.

   Example:
   - Input: array = [1, 5, 7, -1, 5], sum = 6
   - Output: [(1, 5), (7, -1)]
 */

package hashmap.practice1.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question5 
{
	public static List<int[]> findPair(int[] a, int sum)
	{
		Map<Integer, Integer> m1 = new HashMap<Integer,Integer>();
		
		List<int[]> result = new ArrayList<int[]>();
		
		for(int num1 : a)
		{
			int num2 = sum - num1;
			
			if(m1.getOrDefault(num2, 0) > 0)
			{
				result.add(new int[] {num2,num1});
				m1.put(num2,m1.get(num2)-1);
			}
			else
			{
				m1.put(num1, m1.getOrDefault(num1, 0)+1);
			}
		}
		return result;
	}
	
	public static void main(String[] args) 
	{
		int[] arr = {1,5,7,-1,5};
		int sum = 6;
		
		List<int[]> pairs = findPair(arr, sum);

		for (int[] pair : pairs) {
            System.out.println("(" + pair[0] + ", " + pair[1] + ")");
        }
	}
}
