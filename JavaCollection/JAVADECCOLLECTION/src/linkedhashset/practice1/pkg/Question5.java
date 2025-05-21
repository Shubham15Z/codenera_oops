/*
5. Difference of Two Sets
   Write a program to find the difference between two LinkedHashSets 
   (i.e., elements present in the first set but not in the second).
 */

package linkedhashset.practice1.pkg;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Question5
{
	public static void main(String[] args) 
	{
		Set<Integer> set1 = new LinkedHashSet<Integer>(Arrays.asList(1,2,3,4));
		Set<Integer> set2 = new LinkedHashSet<Integer>(Arrays.asList(3,4,5,6));
		
		Set<Integer> difference = new LinkedHashSet<Integer>();
		
		for(int num : set1)
		{
			if(!set2.contains(num))
			{
				difference.add(num);
			}
		}
	
		System.out.println("Difference :"+difference);
	}
}
