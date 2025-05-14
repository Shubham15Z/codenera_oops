/*
Q24. Implement a program to find the cumulative sum of elements in a list using streams.
 */

package streamapi.practice2.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question24 
{
	public static void main(String[] args)
	{
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		
		List<Integer> cumulativeSum = new ArrayList<Integer>();
		
		int sum = 0;
		
		for(int num : l1)
		{
			sum+= num;
			cumulativeSum.add(sum);
		}
		
		System.out.println(cumulativeSum);
	}
}
