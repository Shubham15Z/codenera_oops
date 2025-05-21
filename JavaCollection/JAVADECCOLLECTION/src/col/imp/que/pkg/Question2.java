/*
2. Find Intersection  
   - Question: Given two ArrayList of integers, return the intersection elements in an ArrayList.
   - Input: [1, 2, 3, 4] and [3, 4, 5, 6]
   - Output: [3, 4]
 */

package col.imp.que.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(3,4,5,6));
		
		List<Integer> list3 = new ArrayList<Integer>();
		
		for(int num : list1)
		{
			if(list2.contains(num))
			{
				list3.add(num);
			}
		}
		
		System.out.println("Intersection : "+list3);
	}
}
