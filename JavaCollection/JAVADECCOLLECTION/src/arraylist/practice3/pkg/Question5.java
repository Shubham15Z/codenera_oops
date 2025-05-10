/*
5. Partition ArrayList  
   - Question: Partition an ArrayList of integers into even and odd numbers.
   - Input: [1, 2, 3, 4, 5]
   - Output: Even: [2, 4], Odd: [1, 3, 5]
 */

package arraylist.practice3.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question5 
{
	public static void partitionArrayList(List<Integer> l1)
	{
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		
		for(int num : l1)
		{
			if(num % 2 == 0)
				even.add(num);
			else
				odd.add(num);
		}
		
		System.out.println(even);
		System.out.println(odd);
	}
	public static void main(String[] args) 
	{
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		partitionArrayList(l1);
	}
}
