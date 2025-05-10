/*
2. Find Intersection  
   - Question: Given two ArrayList of integers, return the intersection elements in an ArrayList.
   - Input: [1, 2, 3, 4] and [3, 4, 5, 6]
   - Output: [3, 4]
 */

package arraylist.practice3.pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Question2
{
	public static void main(String[] args) 
	{
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(3,4,5,6));
		
		Set<Integer> s1 = new LinkedHashSet<Integer>();
		
		for(int num : l1)
		{
			if(l2.contains(num))
			{
				s1.add(num);
			}
		}
		System.out.println(s1);
	}
}
