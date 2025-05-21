/*
4. Find Missing Number  
   - Question: Given an ArrayList containing numbers 1 to n with one number missing, find the missing number.
   - Input: [1, 2, 3, 5]
   - Output: 4
 */

package col.imp.que.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question4 
{
	public static int findMissingNumber(List<Integer> list1, int n)
	{
		int totalSum = n*(n+1)/2;
		int listSum = 0;
		for(int num : list1)
		{
			listSum+=num;
		}
		return totalSum-listSum;
	}
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,5));
		int n = list1.getLast();
		int res = findMissingNumber(list1, n);
		System.out.println("Missing Number : "+res);
	}
}
