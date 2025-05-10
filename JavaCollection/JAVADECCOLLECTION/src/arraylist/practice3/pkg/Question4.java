/*
4. Find Missing Number  
   - Question: Given an ArrayList containing numbers 1 to n with one number missing, find the missing number.
   - Input: [1, 2, 3, 5]
   - Output: 4
 */

package arraylist.practice3.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question4 
{
	public static void main(String[] args) 
	{
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5));
		
		int n = l1.size()+1;
		int totalSum = n*(n+1)/2;
		int actualSum = 0;
		
		for(int num : l1)
		{
			actualSum += num;
		}
		
		System.out.println("Missing number is : "+(totalSum-actualSum));
	}
}
