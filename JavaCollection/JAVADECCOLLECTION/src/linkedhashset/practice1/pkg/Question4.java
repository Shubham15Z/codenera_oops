/*
4. Union of Two Sets
   Given two LinkedHashSets, write a program to find the union (i.e., all unique elements from both sets).
 */

package linkedhashset.practice1.pkg;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Question4 
{
	public static void main(String[] args) 
	{
		Set<Integer> set1 = new LinkedHashSet<Integer>(Arrays.asList(1,2,3,4));
		Set<Integer> set2 = new LinkedHashSet<Integer>(Arrays.asList(3,4,5,6));
		
		Set<Integer> union = new LinkedHashSet<Integer>(set1);

		for(int num : set2)
		{
			union.add(num);
		}
		
		System.out.println("Union : "+union);
		
	}
}
